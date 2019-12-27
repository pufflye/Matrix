import java.util.Scanner;

public class Matrix
{
    double a, b, c, d;

    public Matrix()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первый элемент матрицы: ");
        a = in.nextDouble();

        System.out.println("Введите второй элемент матрицы: ");
        b = in.nextDouble();

        System.out.println("Введите третий элемент матрицы: ");
        c = in.nextDouble();

        System.out.println("Введите четвертый элемент матрицы: ");
        d = in.nextDouble();

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static void p(Matrix x, Matrix y)
    {
        double pa = x.a + y.a;
        double pb = x.b + y.b;
        double pc = x.c + y.c;
        double pd = x.d + y.d;

        System.out.println("Сумма матриц: " + pa + "  " + pb + "  ");
        System.out.println("              " + pc + "  " + pd + "  ");
    }

    public static void m(Matrix x, Matrix y)
    {
        double ma = x.a - y.a;
        double mb = x.b - y.b;
        double mc = x.c - y.c;
        double md = x.d - y.d;

        System.out.println("Разность матриц: " + ma + "  " + mb + "  ");
        System.out.println("                 " + mc + "  " + md + "  ");
    }

    public static void mult(Matrix x, Matrix y)
    {
        double mua = x.a*y.a + x.b*y.c;
        double mub = x.a*y.b + x.b*y.d;
        double muc = x.c*y.a + x.d*y.c;
        double mud = x.c*y.b + x.d*y.d;

        System.out.println("Произведение матриц: " + mua + "  " + mub + "   ");
        System.out.println("                     " + muc + "  " + mud + "   ");
    }

    public static void ofm(Matrix x)
    {
        double o = x.a*x.d - x.b*x.c;
        System.out.println("Определитель первой матрицы: " + o);
    }

    public static void obr(Matrix x)
    {
        double obr = x.a*x.d - x.b*x.c;
        if (obr == 0){
            System.out.println("Обратной матрицы не существует.");
        }
        else
            {
            double a1 = x.d;
            double b1 = -1 * x.b;
            double c1 = -1 * x.c;
            double d1 = x.a;

            System.out.println("Обратная матрица:  1/" + obr + "*" + a1 + "  1/" + obr + "*" + b1 + "   ");
            System.out.println("                   1/" + obr + "*" + c1 + "  1/" + obr + "*" + d1 + "   ");
        }
    }

    public static void chis(Matrix x)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число на которое будет умножена первая матрица: ");
        double k = in.nextDouble();

        double chisa = k*x.a;
        double chisb = k*x.b;
        double chisc = k*x.c;
        double chisd = k*x.d;

        System.out.println("Произведение матрицы на число " + k + ": " + chisa + "  " + chisb + "  ");
        System.out.println("                                   " + chisc + "  " + chisd + "  ");
    }
}