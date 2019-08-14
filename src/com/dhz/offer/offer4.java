package com.dhz.offer;
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

public class offer4 {

    /**
     * 先遍历一遍str，统计空格个数
     * 将字符串长度扩为 原来长度 + 2 * 空格数
     * 从后往前遍历字符串，遇到空格添加20%
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {

        int spaceNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                spaceNum++;
        }
        int indexOld = str.length() - 1;
        int newLength = str.length() + 2 * spaceNum;
        int indexNew = newLength - 1;
        str.setLength(newLength);

        for (; indexOld >= 0 && indexOld < newLength; --indexOld) {
            if (str.charAt(indexOld) == ' ') {
                str.setCharAt(indexNew--, '0');
                str.setCharAt(indexNew--, '2');
                str.setCharAt(indexNew--, '%');
            } else {
                str.setCharAt(indexNew--, str.charAt(indexOld));
            }
        }
        return str.toString();
    }
}
