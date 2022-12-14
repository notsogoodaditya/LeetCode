class Solution {
    int n = 0;
    int i = 0;
    int k = 0;
    int indx = k-1;
    StringBuilder[] ans;
    StringBuilder sb;
    char[] s;
    public String convert(String str, int k) {
        this.s = str.toCharArray();
        this.n = s.length;
        this.i = 0;
        this.k = k;
        ans = new StringBuilder[k];
        if(n<k || k<2){
            return str;
        }
        this.indx = k-1;
        for(i=0;i<k;i++){
            sb = new StringBuilder();
            sb.append(s[i]);
            ans[i] = sb;
        }
        solve();
        String zigzag = "";
        for(StringBuilder l : ans){
            zigzag += l.toString();
        }
        return zigzag;
    }
    public void solve(){
        if(i>=n){
            return;
        }
        while(indx>0 && i<n){
            for(int j=0;j<k;j++){
                if(j==indx-1){
                    ans[j].append(s[i]);
                    i++;
                }
            }
            indx--;
        }     
        add();
    }
    public void add(){
        for(int j=1;j<k && i<n;j++){
            ans[j].append(s[i]);
            i++;
        }
        indx = k-1;
        solve();
    }
}