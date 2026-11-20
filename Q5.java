public class Q5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage : java Q5 N");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : N doit être un entier.");
            return;
        }

        for (int ligne = 1; ligne <=n; ligne++) { // fix issue  #1
            StringBuilder sb = new StringBuilder();
            for (int i = ligne; i >= 1; i--) {
                sb.append(i);
                if (i > 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
