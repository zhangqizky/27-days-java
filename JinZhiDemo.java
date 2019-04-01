/*
   不同进制的数据表现
   二进制：由 0，1组成。以0b开头
   八进制：由0，1，，，7组成，以0开头
   十进制：由0，1，2，，，9组成。默认整数是十进制
   十六进制：以0，1，2，9，a,b,c,d,e,f（大小写均可），以0x开头
*/
class JinZhiDemo
{
    public static void main(String[] args)
    {
        System.out.println(100);
        System.out.println(0b100);
        System.out.println(0700);
        System.out.println(0x100);
    }
}