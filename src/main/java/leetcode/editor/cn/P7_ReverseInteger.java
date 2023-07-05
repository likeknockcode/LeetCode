//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// Related Topics 数学 👍 3853 👎 0


package leetcode.editor.cn;

/**
 * 整数反转
 * @author DY
 * @date 2023-07-05 18:59:02
 */
public class P7_ReverseInteger{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P7_ReverseInteger().new Solution();
		 int reverse = solution.reverse(-123);
		 System.out.println(reverse);
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
		int num = 0;
		boolean isEmpty = false;
		try {
			if (x < 0){
				x = x * -1;
				isEmpty = true;
			}
			String s = Integer.toString(x);
			StringBuilder stringBuilder = new StringBuilder(s);
			StringBuilder reverseString = stringBuilder.reverse();
			String s1 = reverseString.toString();
			num = Integer.parseInt(s1);
			if (num > 2147483647 || num < -2147483648){
				return 0;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		if (isEmpty){
			return -num;
		}
		return num;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}