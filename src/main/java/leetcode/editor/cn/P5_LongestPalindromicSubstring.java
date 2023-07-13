//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 字符串 动态规划 👍 6627 👎 0


package leetcode.editor.cn;

import java.util.zip.Adler32;

/**
 * 最长回文子串
 * @author DY
 * @date 2023-07-13 14:40:26
 */
public class P5_LongestPalindromicSubstring{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P5_LongestPalindromicSubstring().new Solution();
		 String bb = solution.longestPalindrome("asodhiqfaifasjfasjdkdaskdjlasjdqjfljaslkjdlkajsdlkajksjdlaksdkasqwnjoqekqndknfejgsfqank");
		 System.out.println(bb);
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
		 //使用动态规划
	/**
	 * @description: 最长回文字串 使用动态规划解法
	 * @author: scv
	 * @date: 2023/7/13 16:59
	 * @param: s
	 * @return: java.lang.String
	 **/
    public String longestPalindrome(String s) {
		int maxLength = 1;//最长回文字符串起始长度
		int start = 0;//最长回文字符串开始位置
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			dp[i][i] = true;
		}
		for ( int len = 2; len <= s.length(); len++) {
			for (int i = 0;i < s.length() - len+1;i ++){
				int j = i + len - 1;
				if (s.charAt(i) == s.charAt(j)){
					if (len == 2 || dp[i+1][j-1]){
						dp[i][j] = true;
						if (len > maxLength){
							maxLength = len;
							start = i;
						}
					}
				}
			}
		}
		return s.substring(start,start+maxLength);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}