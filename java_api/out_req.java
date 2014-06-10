package mdhim;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : mdhim-tng-ycsb/src/range_server.h:1368</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mdhim") 
public abstract class out_req extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : out_req* */
	@Field(0) 
	public Pointer<out_req > next() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : out_req* */
	@Field(0) 
	public out_req next(Pointer<out_req > next) {
		this.io.setPointerField(this, 0, next);
		return this;
	}
	/** C type : out_req* */
	@Field(1) 
	public Pointer<out_req > prev() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : out_req* */
	@Field(1) 
	public out_req prev(Pointer<out_req > prev) {
		this.io.setPointerField(this, 1, prev);
		return this;
	}
	/** C type : void* */
	@Field(2) 
	public Pointer<? > req() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : void* */
	@Field(2) 
	public out_req req(Pointer<? > req) {
		this.io.setPointerField(this, 2, req);
		return this;
	}
	/** Conversion Error : MPI_Request* (failed to convert type to Java (undefined type)) */
}
