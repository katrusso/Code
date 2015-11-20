public class ConsoleInput {
    public static String readLine() {
        StringBuffer response = new StringBuffer();
        try {
            BufferedInputStream buff = new
                BufferedInputStream(System.in);
            int in = 0;
            char inChar;
            do {
                in = buff.read();
                inChar = (char) in;
                if ((in != -1) & (in != '\n') & (in != '\r')) {
                    response.append(inChar);
                }             
            } while ((in != -1) & (inChar != '\n') & (in != '\r'));
            buff.close();
            return response.toString();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }