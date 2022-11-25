import java.util.*;


public class HashListAutocomplete implements Autocompletor {

    private static final int MAX_PREFIX = 10;
    private Map<String, List<Term>> myMap;
    private int mySize;

    public HashListAutocomplete(String[] terms, double[] weights) {
        if (terms == null || weights == null) {
			throw new NullPointerException("One or more arguments null");
		}
		initialize(terms,weights);
    }

    @Override
    public List<Term> topMatches(String prefix, int k) {
        if (prefix.length() > MAX_PREFIX){
            prefix = prefix.substring(0,MAX_PREFIX);
        }
        if(!myMap.containsKey(prefix)){
            return new ArrayList<>();
        }
        List<Term> real = myMap.get(prefix);
        List<Term> list = real.subList(0, Math.min(k, real.size()));
        return list;
    }

    @Override
    public void initialize(String[] terms, double[] weights) {
        if(myMap != null){
            myMap.clear();
        }
        else{
            myMap = new HashMap<>();
        }
        for(int i = 0; i < terms.length; i++) {
            String t = terms[i];
            for(int k = 0; k <= Math.min(MAX_PREFIX,t.length()); k++) {
                String sub = t.substring(0,k);
                Term realT = new Term(terms[i],weights[i]);
                myMap.putIfAbsent(sub,new ArrayList<Term>());
                myMap.get(sub).add(realT);
            }
        }
        for(String s : myMap.keySet()){
            Collections.sort(myMap.get(s), Comparator.comparing(Term::getWeight).reversed());
        }
    }

    @Override
    public int sizeInBytes() {
        if (mySize == 0) {
            for(String t : myMap.keySet()) {
                mySize += BYTES_PER_CHAR * t.length();
                for (Term tt : myMap.get(t)){
                    mySize += BYTES_PER_DOUBLE;
                    mySize += BYTES_PER_CHAR*tt.getWord().length();
                }
            }
        }
        return mySize;
    }
}

