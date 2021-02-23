//package Model.FileWork;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.RandomAccessFile;
//import java.util.Iterator;
//
//import Model.Product;
//
//public class FileIterator implements Iterator<Product> {
//
//	private RandomAccessFile file;
//	
//	public FileIterator(String fileName) throws FileNotFoundException {
//	file = new RandomAccessFile(fileName,"rw");
//	}
//	
//	@Override
//	public boolean hasNext() {
//		try {
//			if(file.getFilePointer()==file.length()) {
//				return false;
//			}
//		} catch (IOException e) {
//			System.out.println("error 1");
//			e.printStackTrace();
//		}
//		return true;
//	}
//
//	@Override
//	public Product next() {
//		
//		return null;
//	}
//
//}
