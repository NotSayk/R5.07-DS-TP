public class Q3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage : java Q3 N");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : N doit être un entier.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            sb.append(i);
            if (i > 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
