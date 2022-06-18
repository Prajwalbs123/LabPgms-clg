package LabSuggestedpgms;
import java.util.*; //to import java.util package;

class Overload{
    int i;
    String str;

    Overload()
    {
        this.i=0;
        this.str=" ";
    }

    Overload(int i,String str)
    {
        this.i=i;
        this.str=str;
    }

    void dis()
    {
        System.out.println(this.i+" "+this.str);
    }

    Overload ret(Overload obj)
    {
        return obj;
    }

}

public class sug45 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close();
        Overload obj = new Overload(12,"hello");
        Overload objc= new Overload();
        objc=obj.ret(obj);
        System.out.println(objc.i+" "+objc.str);

        Override orj =new Override(14,"overridden",12);
        orj.dis(12);

        Inherit inoj = new Inherit(13,"Inherit",15,"inside Inherit");
        inoj.dis(22);

        SiInherit sioj = new SiInherit(23,"2ndchild",(float) 7.12);
        sioj.dis();

        // String1 str = new String1();
        // str.dis();

    }
    
}

class Override extends Overload{
int newval;

Override()
{
    super();
    this.newval=0;
}

Override(int i,String str,int newval) //constructor Overridden
{
    super(i,str);
    this.newval=newval;
}

void dis(int l)  //method Overridden
{
    System.out.print(l+" ");
    System.out.println(this.i+" "+this.str+" "+this.newval+" ");
    System.out.println(super.i);
}

}

class Inherit extends Override{

    String inh;
    
    Inherit()
    {
        super();
        this.inh=" ";
    }

    Inherit(int i,String str,int newval,String inh)
    {
        super(i, str, newval);
        this.inh=inh;
    }

    void dis(int i)
    {
        System.out.println(this.i+" "+this.str+" "+this.newval+" "+this.inh);
        System.out.print(i);
    }

}

class SiInherit extends Overload{

    float num;
    SiInherit()
    {
        super();
        this.num=0;
    }

    SiInherit(int i,String str,float num)
    {
        super(i,str);
        this.num=num;
    }

    void dis()
    {
        System.out.println(this.i+" "+this.str+"  "+this.num);
    }

}
