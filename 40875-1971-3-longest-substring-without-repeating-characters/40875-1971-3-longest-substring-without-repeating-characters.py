class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        result=[0]
        for i in range(len(s)):
            ls=[]
            ls.append(s[i])
            j=i+1
            flag=0
            while(j<len(s)):
                if s[j] in ls:
                    result.append(len(ls))
                    flag=1
                    break
                ls.append(s[j])
                j+=1
            if flag==0:
                result.append(len(ls))
        return (max(result))