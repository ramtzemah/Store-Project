//package Model.FileWork;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.RandomAccessFile;
//
//import Model.Product;
//
//public class fileReadWrite {
//	private RandomAccessFile file;
//	private String filePath;
//	private FileIterator fileIterator;
//	
//	public fileReadWrite(String filePath) throws FileNotFoundException {
//		file = new RandomAccessFile(filePath, "rw");
//		fileIterator = new FileIterator(filePath);
//	}
//
//	public void writeProductToFile() throws IOException {
//		Product temp = new Product(ProductName, barcode, CostPrice, SellingPrice);
//		long filePouter=file.getFilePointer();
//		file.seek(filePouter);
//		String barcode = file.readChar();
//		String name = file.readChars(pro.getProductName());
//		int Cprice = file.reafInt(pro.getCostPrice());
//		int Sprice = file.readInt(pro.getSellingPrice());
//		
//	}
//	
//	public void readProductToFile() throws IOException {
//		long filePouter=file.getFilePointer();
//		file.seek(filePouter);
//		file.writeChars(pro.getBarcode());
//		file.writeChars(pro.getProductName());
//		file.writeInt(pro.getCostPrice());
//		file.writeInt(pro.getSellingPrice());
//		
//	}
//}
