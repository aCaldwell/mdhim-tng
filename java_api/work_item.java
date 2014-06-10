package mdhim;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : mdhim-tng-ycsb/src/range_server.h:1356</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mdhim") 
public class work_item extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : work_item* */
	@Field(0) 
	public Pointer<work_item > next() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : work_item* */
	@Field(0) 
	public work_item next(Pointer<work_item > next) {
		this.io.setPointerField(this, 0, next);
		return this;
	}
	/** C type : work_item* */
	@Field(1) 
	public Pointer<work_item > prev() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : work_item* */
	@Field(1) 
	public work_item prev(Pointer<work_item > prev) {
		this.io.setPointerField(this, 1, prev);
		return this;
	}
	/** C type : void* */
	@Field(2) 
	public Pointer<? > message() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : void* */
	@Field(2) 
	public work_item message(Pointer<? > message) {
		this.io.setPointerField(this, 2, message);
		return this;
	}
	@Field(3) 
	public int source() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public work_item source(int source) {
		this.io.setIntField(this, 3, source);
		return this;
	}
	public work_item() {
		super();
	}
	public work_item(Pointer pointer) {
		super(pointer);
	}
}
