package mote.sending;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'Test_SimpleValues'
 * message type.
 */

public class Test_SimpleValues extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 30;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 120;

    /** Create a new Test_SimpleValues of size 30. */
    public Test_SimpleValues() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new Test_SimpleValues of the given data_length. */
    public Test_SimpleValues(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_SimpleValues with the given data_length
     * and base offset.
     */
    public Test_SimpleValues(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_SimpleValues using the given byte array
     * as backing store.
     */
    public Test_SimpleValues(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_SimpleValues using the given byte array
     * as backing store, with the given base offset.
     */
    public Test_SimpleValues(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_SimpleValues using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public Test_SimpleValues(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_SimpleValues embedded in the given message
     * at the given base offset.
     */
    public Test_SimpleValues(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_SimpleValues embedded in the given message
     * at the given base offset and length.
     */
    public Test_SimpleValues(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <Test_SimpleValues> \n";
      try {
        s += "  [value8=0x"+Long.toHexString(get_value8())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [value16=0x"+Long.toHexString(get_value16())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [value32=0x"+Long.toHexString(get_value32())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [value64=0x"+Long.toHexString(get_value64())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue8=0x"+Long.toHexString(get_uvalue8())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue16=0x"+Long.toHexString(get_uvalue16())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue32=0x"+Long.toHexString(get_uvalue32())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue64=0x"+Long.toHexString(get_uvalue64())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value8
    //   Field type: byte, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value8' is signed (false).
     */
    public static boolean isSigned_value8() {
        return false;
    }

    /**
     * Return whether the field 'value8' is an array (false).
     */
    public static boolean isArray_value8() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'value8'
     */
    public static int offset_value8() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value8'
     */
    public static int offsetBits_value8() {
        return 0;
    }

    /**
     * Return the value (as a byte) of the field 'value8'
     */
    public byte get_value8() {
        return (byte)getSIntBEElement(offsetBits_value8(), 8);
    }

    /**
     * Set the value of the field 'value8'
     */
    public void set_value8(byte value) {
        setSIntBEElement(offsetBits_value8(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'value8'
     */
    public static int size_value8() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'value8'
     */
    public static int sizeBits_value8() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value16
    //   Field type: short, unsigned
    //   Offset (bits): 8
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value16' is signed (false).
     */
    public static boolean isSigned_value16() {
        return false;
    }

    /**
     * Return whether the field 'value16' is an array (false).
     */
    public static boolean isArray_value16() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'value16'
     */
    public static int offset_value16() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value16'
     */
    public static int offsetBits_value16() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'value16'
     */
    public short get_value16() {
        return (short)getSIntBEElement(offsetBits_value16(), 16);
    }

    /**
     * Set the value of the field 'value16'
     */
    public void set_value16(short value) {
        setSIntBEElement(offsetBits_value16(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'value16'
     */
    public static int size_value16() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'value16'
     */
    public static int sizeBits_value16() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value32
    //   Field type: int, unsigned
    //   Offset (bits): 24
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value32' is signed (false).
     */
    public static boolean isSigned_value32() {
        return false;
    }

    /**
     * Return whether the field 'value32' is an array (false).
     */
    public static boolean isArray_value32() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'value32'
     */
    public static int offset_value32() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value32'
     */
    public static int offsetBits_value32() {
        return 24;
    }

    /**
     * Return the value (as a int) of the field 'value32'
     */
    public int get_value32() {
        return (int)getSIntBEElement(offsetBits_value32(), 32);
    }

    /**
     * Set the value of the field 'value32'
     */
    public void set_value32(int value) {
        setSIntBEElement(offsetBits_value32(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'value32'
     */
    public static int size_value32() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'value32'
     */
    public static int sizeBits_value32() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value64
    //   Field type: long, unsigned
    //   Offset (bits): 56
    //   Size (bits): 64
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value64' is signed (false).
     */
    public static boolean isSigned_value64() {
        return false;
    }

    /**
     * Return whether the field 'value64' is an array (false).
     */
    public static boolean isArray_value64() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'value64'
     */
    public static int offset_value64() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value64'
     */
    public static int offsetBits_value64() {
        return 56;
    }

    /**
     * Return the value (as a long) of the field 'value64'
     */
    public long get_value64() {
        return (long)getSIntBEElement(offsetBits_value64(), 64);
    }

    /**
     * Set the value of the field 'value64'
     */
    public void set_value64(long value) {
        setSIntBEElement(offsetBits_value64(), 64, value);
    }

    /**
     * Return the size, in bytes, of the field 'value64'
     */
    public static int size_value64() {
        return (64 / 8);
    }

    /**
     * Return the size, in bits, of the field 'value64'
     */
    public static int sizeBits_value64() {
        return 64;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue8
    //   Field type: short, unsigned
    //   Offset (bits): 120
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue8' is signed (false).
     */
    public static boolean isSigned_uvalue8() {
        return false;
    }

    /**
     * Return whether the field 'uvalue8' is an array (false).
     */
    public static boolean isArray_uvalue8() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue8'
     */
    public static int offset_uvalue8() {
        return (120 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue8'
     */
    public static int offsetBits_uvalue8() {
        return 120;
    }

    /**
     * Return the value (as a short) of the field 'uvalue8'
     */
    public short get_uvalue8() {
        return (short)getUIntBEElement(offsetBits_uvalue8(), 8);
    }

    /**
     * Set the value of the field 'uvalue8'
     */
    public void set_uvalue8(short value) {
        setUIntBEElement(offsetBits_uvalue8(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'uvalue8'
     */
    public static int size_uvalue8() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'uvalue8'
     */
    public static int sizeBits_uvalue8() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue16
    //   Field type: int, unsigned
    //   Offset (bits): 128
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue16' is signed (false).
     */
    public static boolean isSigned_uvalue16() {
        return false;
    }

    /**
     * Return whether the field 'uvalue16' is an array (false).
     */
    public static boolean isArray_uvalue16() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue16'
     */
    public static int offset_uvalue16() {
        return (128 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue16'
     */
    public static int offsetBits_uvalue16() {
        return 128;
    }

    /**
     * Return the value (as a int) of the field 'uvalue16'
     */
    public int get_uvalue16() {
        return (int)getUIntBEElement(offsetBits_uvalue16(), 16);
    }

    /**
     * Set the value of the field 'uvalue16'
     */
    public void set_uvalue16(int value) {
        setUIntBEElement(offsetBits_uvalue16(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'uvalue16'
     */
    public static int size_uvalue16() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'uvalue16'
     */
    public static int sizeBits_uvalue16() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue32
    //   Field type: long, unsigned
    //   Offset (bits): 144
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue32' is signed (false).
     */
    public static boolean isSigned_uvalue32() {
        return false;
    }

    /**
     * Return whether the field 'uvalue32' is an array (false).
     */
    public static boolean isArray_uvalue32() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue32'
     */
    public static int offset_uvalue32() {
        return (144 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue32'
     */
    public static int offsetBits_uvalue32() {
        return 144;
    }

    /**
     * Return the value (as a long) of the field 'uvalue32'
     */
    public long get_uvalue32() {
        return (long)getUIntBEElement(offsetBits_uvalue32(), 32);
    }

    /**
     * Set the value of the field 'uvalue32'
     */
    public void set_uvalue32(long value) {
        setUIntBEElement(offsetBits_uvalue32(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'uvalue32'
     */
    public static int size_uvalue32() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'uvalue32'
     */
    public static int sizeBits_uvalue32() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue64
    //   Field type: long, unsigned
    //   Offset (bits): 176
    //   Size (bits): 64
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue64' is signed (false).
     */
    public static boolean isSigned_uvalue64() {
        return false;
    }

    /**
     * Return whether the field 'uvalue64' is an array (false).
     */
    public static boolean isArray_uvalue64() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue64'
     */
    public static int offset_uvalue64() {
        return (176 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue64'
     */
    public static int offsetBits_uvalue64() {
        return 176;
    }

    /**
     * Return the value (as a long) of the field 'uvalue64'
     */
    public long get_uvalue64() {
        return (long)getUIntBEElement(offsetBits_uvalue64(), 64);
    }

    /**
     * Set the value of the field 'uvalue64'
     */
    public void set_uvalue64(long value) {
        setUIntBEElement(offsetBits_uvalue64(), 64, value);
    }

    /**
     * Return the size, in bytes, of the field 'uvalue64'
     */
    public static int size_uvalue64() {
        return (64 / 8);
    }

    /**
     * Return the size, in bits, of the field 'uvalue64'
     */
    public static int sizeBits_uvalue64() {
        return 64;
    }

}
