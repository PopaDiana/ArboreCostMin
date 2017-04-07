package graf_cost_min_prim;
import java.util.ArrayList;
import java.util.LinkedList;



public class MainPg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Double>> graf=new ArrayList<ArrayList<Double>>();
		graf.add(0,new ArrayList<Double>());
		graf.add(1,new ArrayList<Double>());
		graf.add(2, new ArrayList<Double>());
		graf.add(3, new ArrayList<Double>());
		graf.add(4, new ArrayList<Double>());
		graf.add(5, new ArrayList<Double>());
		Double inf=Double.POSITIVE_INFINITY;
			graf.get(0).add(0,inf);graf.get(0).add(1,1.0);graf.get(0).add(2, 2.0);graf.get(0).add(3,inf);graf.get(0).add(4,inf);
			graf.get(1).add(0,1.0);graf.get(1).add(1,inf);graf.get(1).add(2,7.0);graf.get(1).add(3,6.0);graf.get(1).add(4,inf);
			graf.get(2).add(0,2.0);graf.get(2).add(1,7.0);graf.get(2).add(2,inf);graf.get(2).add(3,1.0);graf.get(2).add(4,8.0);
			graf.get(3).add(0,inf);graf.get(3).add(1,6.0);graf.get(3).add(2,1.0);graf.get(3).add(3,inf);graf.get(3).add(4,7.0);
			graf.get(4).add(0,inf);graf.get(4).add(1,inf);graf.get(4).add(2,8.0);graf.get(4).add(3,7.0);graf.get(4).add(4,inf);

		
		for(int i=0;i<graf.size();i++)
		{
			for(int j=0;j<graf.get(i).size();j++)
				System.out.print(graf.get(i).get(j)+"  ");
			System.out.println();
		}
		
		LinkedList<Edge> arbore=new LinkedList<Edge>();
		arbore=Prim(graf);
		for(int i=0;i<arbore.size();i++)
		{
			System.out.print("( "+arbore.get(i).nod_i+" , "+arbore.get(i).nod_o+" )-- "+arbore.get(i).cost);
			System.out.println();
		}
	
	}
	public static LinkedList<Edge> Prim(ArrayList<ArrayList<Double>> graf)
	{
		LinkedList<Edge> arbore=new LinkedList<Edge>();
		ArrayList<Integer> vecin=new ArrayList<Integer>();
		ArrayList<Double> mincost=new ArrayList<Double>();
		
		int i,k=0;
		
		for(i=0;i<5;i++)
		{
			mincost.add(graf.get(0).get(i));
			vecin.add(0);
		}
		
		for(i=0;i<4;i++)
		{
			double min=Double.POSITIVE_INFINITY;
			for(int j=1;j<5;j++)
				if(mincost.get(j)>0)
					if(mincost.get(j)<min)
					{
						min=mincost.get(j);
						k=j;
					}
			arbore.add(new Edge(k,vecin.get(k),graf.get(k).get(vecin.get(k))));
			mincost.set(k, -1.0);
			for(int j=1;j<5;j++)
			{
				if(graf.get(k).get(j)<mincost.get(j))
				{
					mincost.set(j, graf.get(k).get(j));
					vecin.set(j,k);
				}
			}
			
			
		}
		
		return arbore;

	}
}