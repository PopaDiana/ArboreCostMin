package graf_cost_minim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class MainPg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Edge> graf=new ArrayList<Edge>();
		graf.add(new Edge(1,2,1));
		graf.add(new Edge(1,3,2));
		graf.add(new Edge(3,4,1));
		graf.add(new Edge(3,5,8));
		graf.add(new Edge(2,3,7));
		graf.add(new Edge(2,4,6));
		graf.add(new Edge(4,5,7));
		Collections.sort(graf);
		System.out.println(graf);
		
		
		ArrayList<Edge> arbore_c_min=new ArrayList<Edge>();
		int n=5;
		arbore_c_min=Kruskal(graf,n);
		System.out.println("Arborele de cost minim:");
		System.out.println(arbore_c_min);
		

	}
	public static int  Find(int x, ArrayList<Integer> v)
	{
		return v.get(x);	
	}
	public static void Merge(ArrayList<Integer> v,int a,int b)
	{
		int i=a,j=b,aux;
		if(i>j){aux=i;j=i;j=aux;}
		for(int k=0;k<v.size();k++)
			if(v.get(k)==j)v.set(k, i);
	}
	public static ArrayList<Edge> Kruskal(ArrayList<Edge> graf,int nr_vf)
	{
		ArrayList<Edge> arbore=new ArrayList<Edge>();
		ArrayList<Integer> varfuri=new ArrayList<Integer>(nr_vf);
		for(int i=0;i<nr_vf;i++)
			varfuri.add(i, i+1);
		int vf1,vf2,poz=0;
		do
		{
			vf1=Find(graf.get(poz).getNod_i()-1, varfuri);
			vf2=Find(graf.get(poz).getNod_o()-1,varfuri);
			if(vf1!=vf2)
			{
				Merge(varfuri, vf1, vf2);
				arbore.add(new Edge(graf.get(poz).getNod_i(),graf.get(poz).getNod_o(),graf.get(poz).getValue()));
			}
			graf.remove(poz);
		}
		while(arbore.size()<nr_vf-1);
		
		return arbore;
	}

}
