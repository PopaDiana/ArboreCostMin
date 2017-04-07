package graf_cost_minim;

public class Edge implements Comparable<Edge>{

	int nod_i;
	int nod_o;
	int value;
	
	public Edge(int ni,int no,int v)
	{
		nod_i=ni;
		nod_o=no;
		value=v;
	}

	public int getNod_i() {
		return nod_i;
	}


	public void setNod_i(int nod_i) {
		this.nod_i = nod_i;
	}

	
	public int getNod_o() {
		return nod_o;
	}

	public void setNod_o(int nod_o) {
		this.nod_o = nod_o;
	}

	
	public int getValue() {
		return value;
	}

	
	public void setValue(int value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		if(this.value>o.value)return 1;
		else if(this.value<o.value)return -1;
		else
		{
			if(this.nod_i>o.nod_i)return 1;
			else if (this.nod_i<o.nod_i)return -1;
			else
			{
				if(this.nod_o>o.nod_o)return 1;
				else if(this.nod_o<o.nod_o)return -1;
				else return 0;
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Edge ( " + nod_i + " , " + nod_o + " ) Value=" + value + ";"+" \n";
	}
	
	
}
