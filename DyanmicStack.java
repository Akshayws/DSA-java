package ak;

import java.util.Arrays;

public class DyanmicStack extends CustumStack {

	public DyanmicStack() {
		super();
		
	}
	public DyanmicStack(int size)
	{
		super(size);
	}
	@Override
	 public boolean push(int item) {
        // this takes care of it being full
        if (this.isfull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
//            for (int i = 0; i < data.length; i++) {
//                temp[i] = data[i];
//            }
             Arrays.copyOf(data,data.length);
           // data = temp;
        }

        // at this point we know that array is not full
        // insert item
     
        return super.push(item);
    }
	
	
}
