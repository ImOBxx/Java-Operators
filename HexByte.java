
public class HexByte {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		char hex[] = {
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
		};
		byte b = (byte) 0xf1;
		System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
		
		

	}

}
                    