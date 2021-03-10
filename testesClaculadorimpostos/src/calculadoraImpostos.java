public class calculadoraImpostos {
        public static double descontoINSS(double salarioBase) {
            double aliq1 = 0.08;
            double aliq2 = 0.09;
            double aliq3 = 0.11;
            double salarioComINSS = 0;
            if (salarioBase <= 1500) {
                salarioComINSS = salarioBase - (aliq1 * salarioBase);
            }
            else if(salarioBase > 1500 &&  salarioBase < 4000) {
                salarioComINSS = salarioBase - (aliq2 * salarioBase);
            }
            else {
                salarioComINSS = salarioBase - (aliq3 * salarioBase);
            }
            return salarioComINSS;
        }
    public static double descontoIRRF(double salarioCoomDescINSS){
        double aliq1 = 0.075;
        double aliq2 = 0.15;
        double salarioLiquido = 0;

        if (salarioCoomDescINSS < 1039) {
            salarioLiquido = 0.0;
        }
        else if (salarioCoomDescINSS >= 1039 && salarioCoomDescINSS <= 3000) {
            salarioLiquido = salarioCoomDescINSS;
        }
        else if (salarioCoomDescINSS > 3000 && salarioCoomDescINSS <= 6000){
            salarioLiquido = salarioCoomDescINSS - (salarioCoomDescINSS * aliq1);
        }
        else {
            salarioLiquido = Math.round(salarioCoomDescINSS - (salarioCoomDescINSS * aliq2));
        }
        return  salarioLiquido;
    }
    public static void main(String[] args) {
        System.out.println("O desconto é:");
        System.out.println( descontoINSS(6000.37));
        System.out.println( descontoIRRF(900));
    }
}
