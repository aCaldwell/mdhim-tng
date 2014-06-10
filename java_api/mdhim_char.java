package mdhim;
import org.bridj.BridJ;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Used for hashing strings to the appropriate range server<br>
 * <i>native declaration : mdhim-tng-ycsb/src/partitioner.h:1407</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mdhim") 
public abstract class mdhim_char extends StructObject {
	static {
		BridJ.register();
	}
	/** we'll use this field as the key */
	@Field(0) 
	public int id() {
		return this.io.getIntField(this, 0);
	}
	/** we'll use this field as the key */
	@Field(0) 
	public mdhim_char id(int id) {
		this.io.setIntField(this, 0, id);
		return this;
	}
	@Field(1) 
	public int pos() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public mdhim_char pos(int pos) {
		this.io.setIntField(this, 1, pos);
		return this;
	}
	/** Conversion Error : UT_hash_handle (failed to convert type to Java (undefined type)) */
}
