class Solution {
    public String validIPAddress(String str) {

        if (str.length() == 0)
            return "Neither";

        if (str.charAt(0) == ':' || str.charAt(0) == '.')
            return "Neither";

        if (str.charAt(str.length() - 1) == ':' ||
                str.charAt(str.length() - 1) == '.')
            return "Neither";

        boolean alp = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

            } else if (ch == '.') {

            } else {
                alp = true;
            }
        }

        if (alp) {

            String[] arr = str.split(":", -1);

            if (arr.length != 8)
                return "Neither";

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].length() == 0 || arr[i].length() > 4)
                    return "Neither";

                for (int j = 0; j < arr[i].length(); j++) {

                    char ch = arr[i].charAt(j);

                    boolean validHex = (ch >= '0' && ch <= '9') ||
                            (ch >= 'a' && ch <= 'f') ||
                            (ch >= 'A' && ch <= 'F');

                    if (!validHex)
                        return "Neither";
                }
            }

            return "IPv6";
        }

        String[] arr = str.split("\\.", -1);

        if (arr.length != 4)
            return "Neither";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() == 0 || arr[i].length() > 3)
                return "Neither";

            if (arr[i].length() > 1 && arr[i].charAt(0) == '0')
                return "Neither";

            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);

                if (ch < '0' || ch > '9')
                    return "Neither";
            }

            if (Integer.parseInt(arr[i]) > 255)
                return "Neither";
        }

        return "IPv4";
    }
}