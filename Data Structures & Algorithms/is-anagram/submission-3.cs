public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length){
            return false;
        }

        Dictionary<char, int> count = new Dictionary<char, int>();

        for(int i=0; i< s.Length; i++){
            int val1, val2 = 0;
            if(count.TryGetValue(s.ElementAt(i),out val1)){
            count[s.ElementAt(i)] = val1+1;
            } else
            count.Add(s.ElementAt(i), 1);

            if(count.TryGetValue(t.ElementAt(i),out val2)){
                count[t.ElementAt(i)] = val2-1;
            } else
            count.Add(t.ElementAt(i), -1);
        }

        foreach( var pair in count){
            if(pair.Value > 0){
                return false;
            }
        }
        return true;
    }
}
