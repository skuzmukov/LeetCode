package strings.Task_1108;

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder(address.length() + 3 * 2);
        for (int i = 0; i < address.length(); i++) {
            res.append(address.charAt(i) == '.' ? "[.]" : address.charAt(i));
        }
        return res.toString();
    }
}