package graf_cost_min_prim;

public class Edge 
{
	double nod_i;
	double nod_o;
	double cost;
	Edge(double in,double out,double c)
	{
		nod_i=in;
		nod_o=out;
		cost=c;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the nod_i
	 */
	public double getNod_i() {
		return nod_i;
	}
	/**
	 * @param nod_i the nod_i to set
	 */
	public void setNod_i(double nod_i) {
		this.nod_i = nod_i;
	}
	/**
	 * @return the nod_o
	 */
	public double getNod_o() {
		return nod_o;
	}
	/**
	 * @param nod_o the nod_o to set
	 */
	public void setNod_o(double nod_o) {
		this.nod_o = nod_o;
	}
	
}
