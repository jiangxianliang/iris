package mote.sending;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'Test_ArrayValues'
 * message type.
 */

public class Test_ArrayValues extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 150;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 123;

    /** Create a new Test_ArrayValues of size 150. */
    public Test_ArrayValues() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new Test_ArrayValues of the given data_length. */
    public Test_ArrayValues(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_ArrayValues with the given data_length
     * and base offset.
     */
    public Test_ArrayValues(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_ArrayValues using the given byte array
     * as backing store.
     */
    public Test_ArrayValues(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_ArrayValues using the given byte array
     * as backing store, with the given base offset.
     */
    public Test_ArrayValues(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_ArrayValues using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public Test_ArrayValues(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_ArrayValues embedded in the given message
     * at the given base offset.
     */
    public Test_ArrayValues(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Test_ArrayValues embedded in the given message
     * at the given base offset and length.
     */
    public Test_ArrayValues(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <Test_ArrayValues> \n";
      try {
        s += "  [value8=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_value8(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [value16=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_value16(i) & 0xffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [value32=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_value32(i) & 0xffffffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [value64=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_value64(i))+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue8=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_uvalue8(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue16=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_uvalue16(i) & 0xffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue32=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_uvalue32(i) & 0xffffffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [uvalue64=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_uvalue64(i))+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value8
    //   Field type: byte[], unsigned
    //   Offset (bits): 0
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value8' is signed (false).
     */
    public static boolean isSigned_value8() {
        return false;
    }

    /**
     * Return whether the field 'value8' is an array (true).
     */
    public static boolean isArray_value8() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'value8'
     */
    public static int offset_value8(int index1) {
        int offset = 0;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value8'
     */
    public static int offsetBits_value8(int index1) {
        int offset = 0;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return offset;
    }

    /**
     * Return the entire array 'value8' as a byte[]
     */
    public byte[] get_value8() {
        byte[] tmp = new byte[5];
        for (int index0 = 0; index0 < numElements_value8(0); index0++) {
            tmp[index0] = getElement_value8(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'value8' from the given byte[]
     */
    public void set_value8(byte[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_value8(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a byte) of the array 'value8'
     */
    public byte getElement_value8(int index1) {
        return (byte)getSIntBEElement(offsetBits_value8(index1), 8);
    }

    /**
     * Set an element of the array 'value8'
     */
    public void setElement_value8(int index1, byte value) {
        setSIntBEElement(offsetBits_value8(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'value8'
     */
    public static int totalSize_value8() {
        return (40 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'value8'
     */
    public static int totalSizeBits_value8() {
        return 40;
    }

    /**
     * Return the size, in bytes, of each element of the array 'value8'
     */
    public static int elementSize_value8() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'value8'
     */
    public static int elementSizeBits_value8() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'value8'
     */
    public static int numDimensions_value8() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'value8'
     */
    public static int numElements_value8() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'value8'
     * for the given dimension.
     */
    public static int numElements_value8(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'value8' with a String
     */
    public void setString_value8(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_value8(i, (byte)s.charAt(i));
         }
         setElement_value8(i, (byte)0); //null terminate
    }

    /**
     * Read the array 'value8' as a String
     */
    public String getString_value8() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,5)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_value8(i) == (char)0) break;
             carr[i] = (char)getElement_value8(i);
         }
         return new String(carr,0,i);
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value16
    //   Field type: short[], unsigned
    //   Offset (bits): 40
    //   Size of each element (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value16' is signed (false).
     */
    public static boolean isSigned_value16() {
        return false;
    }

    /**
     * Return whether the field 'value16' is an array (true).
     */
    public static boolean isArray_value16() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'value16'
     */
    public static int offset_value16(int index1) {
        int offset = 40;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value16'
     */
    public static int offsetBits_value16(int index1) {
        int offset = 40;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return offset;
    }

    /**
     * Return the entire array 'value16' as a short[]
     */
    public short[] get_value16() {
        short[] tmp = new short[5];
        for (int index0 = 0; index0 < numElements_value16(0); index0++) {
            tmp[index0] = getElement_value16(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'value16' from the given short[]
     */
    public void set_value16(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_value16(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'value16'
     */
    public short getElement_value16(int index1) {
        return (short)getSIntBEElement(offsetBits_value16(index1), 16);
    }

    /**
     * Set an element of the array 'value16'
     */
    public void setElement_value16(int index1, short value) {
        setSIntBEElement(offsetBits_value16(index1), 16, value);
    }

    /**
     * Return the total size, in bytes, of the array 'value16'
     */
    public static int totalSize_value16() {
        return (80 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'value16'
     */
    public static int totalSizeBits_value16() {
        return 80;
    }

    /**
     * Return the size, in bytes, of each element of the array 'value16'
     */
    public static int elementSize_value16() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'value16'
     */
    public static int elementSizeBits_value16() {
        return 16;
    }

    /**
     * Return the number of dimensions in the array 'value16'
     */
    public static int numDimensions_value16() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'value16'
     */
    public static int numElements_value16() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'value16'
     * for the given dimension.
     */
    public static int numElements_value16(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value32
    //   Field type: int[], unsigned
    //   Offset (bits): 120
    //   Size of each element (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value32' is signed (false).
     */
    public static boolean isSigned_value32() {
        return false;
    }

    /**
     * Return whether the field 'value32' is an array (true).
     */
    public static boolean isArray_value32() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'value32'
     */
    public static int offset_value32(int index1) {
        int offset = 120;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 32;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value32'
     */
    public static int offsetBits_value32(int index1) {
        int offset = 120;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 32;
        return offset;
    }

    /**
     * Return the entire array 'value32' as a int[]
     */
    public int[] get_value32() {
        int[] tmp = new int[5];
        for (int index0 = 0; index0 < numElements_value32(0); index0++) {
            tmp[index0] = getElement_value32(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'value32' from the given int[]
     */
    public void set_value32(int[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_value32(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a int) of the array 'value32'
     */
    public int getElement_value32(int index1) {
        return (int)getSIntBEElement(offsetBits_value32(index1), 32);
    }

    /**
     * Set an element of the array 'value32'
     */
    public void setElement_value32(int index1, int value) {
        setSIntBEElement(offsetBits_value32(index1), 32, value);
    }

    /**
     * Return the total size, in bytes, of the array 'value32'
     */
    public static int totalSize_value32() {
        return (160 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'value32'
     */
    public static int totalSizeBits_value32() {
        return 160;
    }

    /**
     * Return the size, in bytes, of each element of the array 'value32'
     */
    public static int elementSize_value32() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'value32'
     */
    public static int elementSizeBits_value32() {
        return 32;
    }

    /**
     * Return the number of dimensions in the array 'value32'
     */
    public static int numDimensions_value32() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'value32'
     */
    public static int numElements_value32() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'value32'
     * for the given dimension.
     */
    public static int numElements_value32(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: value64
    //   Field type: long[], unsigned
    //   Offset (bits): 280
    //   Size of each element (bits): 64
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'value64' is signed (false).
     */
    public static boolean isSigned_value64() {
        return false;
    }

    /**
     * Return whether the field 'value64' is an array (true).
     */
    public static boolean isArray_value64() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'value64'
     */
    public static int offset_value64(int index1) {
        int offset = 280;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 64;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'value64'
     */
    public static int offsetBits_value64(int index1) {
        int offset = 280;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 64;
        return offset;
    }

    /**
     * Return the entire array 'value64' as a long[]
     */
    public long[] get_value64() {
        long[] tmp = new long[5];
        for (int index0 = 0; index0 < numElements_value64(0); index0++) {
            tmp[index0] = getElement_value64(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'value64' from the given long[]
     */
    public void set_value64(long[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_value64(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a long) of the array 'value64'
     */
    public long getElement_value64(int index1) {
        return (long)getSIntBEElement(offsetBits_value64(index1), 64);
    }

    /**
     * Set an element of the array 'value64'
     */
    public void setElement_value64(int index1, long value) {
        setSIntBEElement(offsetBits_value64(index1), 64, value);
    }

    /**
     * Return the total size, in bytes, of the array 'value64'
     */
    public static int totalSize_value64() {
        return (320 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'value64'
     */
    public static int totalSizeBits_value64() {
        return 320;
    }

    /**
     * Return the size, in bytes, of each element of the array 'value64'
     */
    public static int elementSize_value64() {
        return (64 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'value64'
     */
    public static int elementSizeBits_value64() {
        return 64;
    }

    /**
     * Return the number of dimensions in the array 'value64'
     */
    public static int numDimensions_value64() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'value64'
     */
    public static int numElements_value64() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'value64'
     * for the given dimension.
     */
    public static int numElements_value64(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue8
    //   Field type: short[], unsigned
    //   Offset (bits): 600
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue8' is signed (false).
     */
    public static boolean isSigned_uvalue8() {
        return false;
    }

    /**
     * Return whether the field 'uvalue8' is an array (true).
     */
    public static boolean isArray_uvalue8() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue8'
     */
    public static int offset_uvalue8(int index1) {
        int offset = 600;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue8'
     */
    public static int offsetBits_uvalue8(int index1) {
        int offset = 600;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return offset;
    }

    /**
     * Return the entire array 'uvalue8' as a short[]
     */
    public short[] get_uvalue8() {
        short[] tmp = new short[5];
        for (int index0 = 0; index0 < numElements_uvalue8(0); index0++) {
            tmp[index0] = getElement_uvalue8(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'uvalue8' from the given short[]
     */
    public void set_uvalue8(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_uvalue8(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'uvalue8'
     */
    public short getElement_uvalue8(int index1) {
        return (short)getUIntBEElement(offsetBits_uvalue8(index1), 8);
    }

    /**
     * Set an element of the array 'uvalue8'
     */
    public void setElement_uvalue8(int index1, short value) {
        setUIntBEElement(offsetBits_uvalue8(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'uvalue8'
     */
    public static int totalSize_uvalue8() {
        return (40 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'uvalue8'
     */
    public static int totalSizeBits_uvalue8() {
        return 40;
    }

    /**
     * Return the size, in bytes, of each element of the array 'uvalue8'
     */
    public static int elementSize_uvalue8() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'uvalue8'
     */
    public static int elementSizeBits_uvalue8() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'uvalue8'
     */
    public static int numDimensions_uvalue8() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'uvalue8'
     */
    public static int numElements_uvalue8() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'uvalue8'
     * for the given dimension.
     */
    public static int numElements_uvalue8(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'uvalue8' with a String
     */
    public void setString_uvalue8(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_uvalue8(i, (short)s.charAt(i));
         }
         setElement_uvalue8(i, (short)0); //null terminate
    }

    /**
     * Read the array 'uvalue8' as a String
     */
    public String getString_uvalue8() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,5)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_uvalue8(i) == (char)0) break;
             carr[i] = (char)getElement_uvalue8(i);
         }
         return new String(carr,0,i);
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue16
    //   Field type: int[], unsigned
    //   Offset (bits): 640
    //   Size of each element (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue16' is signed (false).
     */
    public static boolean isSigned_uvalue16() {
        return false;
    }

    /**
     * Return whether the field 'uvalue16' is an array (true).
     */
    public static boolean isArray_uvalue16() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue16'
     */
    public static int offset_uvalue16(int index1) {
        int offset = 640;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue16'
     */
    public static int offsetBits_uvalue16(int index1) {
        int offset = 640;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return offset;
    }

    /**
     * Return the entire array 'uvalue16' as a int[]
     */
    public int[] get_uvalue16() {
        int[] tmp = new int[5];
        for (int index0 = 0; index0 < numElements_uvalue16(0); index0++) {
            tmp[index0] = getElement_uvalue16(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'uvalue16' from the given int[]
     */
    public void set_uvalue16(int[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_uvalue16(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a int) of the array 'uvalue16'
     */
    public int getElement_uvalue16(int index1) {
        return (int)getUIntBEElement(offsetBits_uvalue16(index1), 16);
    }

    /**
     * Set an element of the array 'uvalue16'
     */
    public void setElement_uvalue16(int index1, int value) {
        setUIntBEElement(offsetBits_uvalue16(index1), 16, value);
    }

    /**
     * Return the total size, in bytes, of the array 'uvalue16'
     */
    public static int totalSize_uvalue16() {
        return (80 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'uvalue16'
     */
    public static int totalSizeBits_uvalue16() {
        return 80;
    }

    /**
     * Return the size, in bytes, of each element of the array 'uvalue16'
     */
    public static int elementSize_uvalue16() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'uvalue16'
     */
    public static int elementSizeBits_uvalue16() {
        return 16;
    }

    /**
     * Return the number of dimensions in the array 'uvalue16'
     */
    public static int numDimensions_uvalue16() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'uvalue16'
     */
    public static int numElements_uvalue16() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'uvalue16'
     * for the given dimension.
     */
    public static int numElements_uvalue16(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue32
    //   Field type: long[], unsigned
    //   Offset (bits): 720
    //   Size of each element (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue32' is signed (false).
     */
    public static boolean isSigned_uvalue32() {
        return false;
    }

    /**
     * Return whether the field 'uvalue32' is an array (true).
     */
    public static boolean isArray_uvalue32() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue32'
     */
    public static int offset_uvalue32(int index1) {
        int offset = 720;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 32;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue32'
     */
    public static int offsetBits_uvalue32(int index1) {
        int offset = 720;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 32;
        return offset;
    }

    /**
     * Return the entire array 'uvalue32' as a long[]
     */
    public long[] get_uvalue32() {
        long[] tmp = new long[5];
        for (int index0 = 0; index0 < numElements_uvalue32(0); index0++) {
            tmp[index0] = getElement_uvalue32(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'uvalue32' from the given long[]
     */
    public void set_uvalue32(long[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_uvalue32(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a long) of the array 'uvalue32'
     */
    public long getElement_uvalue32(int index1) {
        return (long)getUIntBEElement(offsetBits_uvalue32(index1), 32);
    }

    /**
     * Set an element of the array 'uvalue32'
     */
    public void setElement_uvalue32(int index1, long value) {
        setUIntBEElement(offsetBits_uvalue32(index1), 32, value);
    }

    /**
     * Return the total size, in bytes, of the array 'uvalue32'
     */
    public static int totalSize_uvalue32() {
        return (160 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'uvalue32'
     */
    public static int totalSizeBits_uvalue32() {
        return 160;
    }

    /**
     * Return the size, in bytes, of each element of the array 'uvalue32'
     */
    public static int elementSize_uvalue32() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'uvalue32'
     */
    public static int elementSizeBits_uvalue32() {
        return 32;
    }

    /**
     * Return the number of dimensions in the array 'uvalue32'
     */
    public static int numDimensions_uvalue32() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'uvalue32'
     */
    public static int numElements_uvalue32() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'uvalue32'
     * for the given dimension.
     */
    public static int numElements_uvalue32(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: uvalue64
    //   Field type: long[], unsigned
    //   Offset (bits): 880
    //   Size of each element (bits): 64
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'uvalue64' is signed (false).
     */
    public static boolean isSigned_uvalue64() {
        return false;
    }

    /**
     * Return whether the field 'uvalue64' is an array (true).
     */
    public static boolean isArray_uvalue64() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'uvalue64'
     */
    public static int offset_uvalue64(int index1) {
        int offset = 880;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 64;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'uvalue64'
     */
    public static int offsetBits_uvalue64(int index1) {
        int offset = 880;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 64;
        return offset;
    }

    /**
     * Return the entire array 'uvalue64' as a long[]
     */
    public long[] get_uvalue64() {
        long[] tmp = new long[5];
        for (int index0 = 0; index0 < numElements_uvalue64(0); index0++) {
            tmp[index0] = getElement_uvalue64(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'uvalue64' from the given long[]
     */
    public void set_uvalue64(long[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_uvalue64(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a long) of the array 'uvalue64'
     */
    public long getElement_uvalue64(int index1) {
        return (long)getUIntBEElement(offsetBits_uvalue64(index1), 64);
    }

    /**
     * Set an element of the array 'uvalue64'
     */
    public void setElement_uvalue64(int index1, long value) {
        setUIntBEElement(offsetBits_uvalue64(index1), 64, value);
    }

    /**
     * Return the total size, in bytes, of the array 'uvalue64'
     */
    public static int totalSize_uvalue64() {
        return (320 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'uvalue64'
     */
    public static int totalSizeBits_uvalue64() {
        return 320;
    }

    /**
     * Return the size, in bytes, of each element of the array 'uvalue64'
     */
    public static int elementSize_uvalue64() {
        return (64 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'uvalue64'
     */
    public static int elementSizeBits_uvalue64() {
        return 64;
    }

    /**
     * Return the number of dimensions in the array 'uvalue64'
     */
    public static int numDimensions_uvalue64() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'uvalue64'
     */
    public static int numElements_uvalue64() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'uvalue64'
     * for the given dimension.
     */
    public static int numElements_uvalue64(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

}
