import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> test = eratosthene(97);
//        for (int i:test)
//        {
//            System.out.println(i);
//        }
//
//        goldbachConjecture(120);

        ArrayList<Integer> one = new ArrayList<>();
        one.add(9); one.add(4); one.add(6); one.add(8); one.add(1); one.add(3); one.add(5); one.add(7); one.add(9);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(9); two.add(3); two.add(5); two.add(7); two.add(9);

        ArrayList<Integer> ans = add(one,two);
        for (int i:ans)
        {
            System.out.println(i);
        }

    }

    public static ArrayList<Integer> add (ArrayList<Integer> first, ArrayList<Integer> second)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        int a = first.size()-1;
        int b = second.size()-1;
        int temp = 0;
        while(a >= 0 || b >= 0)
        {
            if(a >= 0 && b >= 0)
            {
                ans.add(0, (first.get(a) + second.get(b) + temp) % 10);
                temp = (first.get(a) + second.get(b) + temp) / 10;
            }
            else if(a>=0)
            {
                ans.add(0, first.get(a)+temp);
                temp = 0;
            }
            else
            {
                ans.add(0,second.get(b)+temp);
                temp = 0;
            }


            a--;
            b--;
        }
        if(temp>0)
            ans.add(0,temp);

        return ans;
    }


    public static void goldbachConjecture (int even)
    {
        ArrayList<Integer> prime = eratosthene(even);
        for (int num:prime)
        {
            if(prime.contains(even-num))
            {
                System.out.println(num + " + " + (even-num));
                break;
            }
        }
    }


    public static ArrayList<Integer> eratosthene (int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i=2; i<=n; i++)
        {
            num.add(i);
        }

        int p = 2;
        while(num.size()>0 && p<n)
        {
            p=num.get(0);
            ans.add(p);
            int i=0;
            while(i<num.size())
            {
                if(num.get(i)%p == 0)
                {
                    num.remove(i);
                    i--;
                }

                i++;
            }
        }

        return ans;
    }
}
