package mote.sending;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'musr_message_t'
 * message type.
 */

public class musr_message_t extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 16;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 40;

    /** Create a new musr_message_t of size 16. */
    public musr_message_t() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new musr_message_t of the given data_length. */
    public musr_message_t(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new musr_message_t with the given data_length
     * and base offset.
     */
    public musr_message_t(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new musr_message_t using the given byte array
     * as backing store.
     */
    public musr_message_t(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new musr_message_t using the given byte array
     * as backing store, with the given base offset.
     */
    public musr_message_t(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new musr_message_t using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public musr_message_t(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new musr_message_t embedded in the given message
     * at the given base offset.
     */
    public musr_message_t(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new musr_message_t embedded in the given message
     * at the given base offset and length.
     */
    public musr_message_t(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <musr_message_t> \n";
      try {
        s += "  [header.experimentID=0x"+Long.toHexString(get_header_experimentID())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [header.msgType=0x"+Long.toHexString(get_header_msgType())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.initMsg.pushNumber=0x"+Long.toHexString(get_body_initMsg_pushNumber())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.initMsg.txPowerUAV=0x"+Long.toHexString(get_body_initMsg_txPowerUAV())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.pushMsg.seqNumberPush=0x"+Long.toHexString(get_body_pushMsg_seqNumberPush())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.pushMsg.lqMetricPush.RSSI=0x"+Long.toHexString(get_body_pushMsg_lqMetricPush_RSSI())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.pushMsg.lqMetricPush.LQI=0x"+Long.toHexString(get_body_pushMsg_lqMetricPush_LQI())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.pushMsg.lqMetricPush.CRC=0x"+Long.toHexString(get_body_pushMsg_lqMetricPush_CRC())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.pushMsg.lqMetricPush.noiseFlr=0x"+Long.toHexString(get_body_pushMsg_lqMetricPush_noiseFlr())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.pushMsg.tempUAV=0x"+Long.toHexString(get_body_pushMsg_tempUAV())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [body.pushMsg.humidUAV=0x"+Long.toHexString(get_body_pushMsg_humidUAV())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: header.experimentID
    //   Field type: short
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'header.experimentID' is signed (false).
     */
    public static boolean isSigned_header_experimentID() {
        return false;
    }

    /**
     * Return whether the field 'header.experimentID' is an array (false).
     */
    public static boolean isArray_header_experimentID() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'header.experimentID'
     */
    public static int offset_header_experimentID() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'header.experimentID'
     */
    public static int offsetBits_header_experimentID() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'header.experimentID'
     */
    public short get_header_experimentID() {
        return (short)getUIntBEElement(offsetBits_header_experimentID(), 8);
    }

    /**
     * Set the value of the field 'header.experimentID'
     */
    public void set_header_experimentID(short value) {
        setUIntBEElement(offsetBits_header_experimentID(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'header.experimentID'
     */
    public static int size_header_experimentID() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'header.experimentID'
     */
    public static int sizeBits_header_experimentID() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: header.msgType
    //   Field type: short
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'header.msgType' is signed (false).
     */
    public static boolean isSigned_header_msgType() {
        return false;
    }

    /**
     * Return whether the field 'header.msgType' is an array (false).
     */
    public static boolean isArray_header_msgType() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'header.msgType'
     */
    public static int offset_header_msgType() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'header.msgType'
     */
    public static int offsetBits_header_msgType() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'header.msgType'
     */
    public short get_header_msgType() {
        return (short)getUIntBEElement(offsetBits_header_msgType(), 8);
    }

    /**
     * Set the value of the field 'header.msgType'
     */
    public void set_header_msgType(short value) {
        setUIntBEElement(offsetBits_header_msgType(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'header.msgType'
     */
    public static int size_header_msgType() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'header.msgType'
     */
    public static int sizeBits_header_msgType() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.initMsg.pushNumber
    //   Field type: int
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.initMsg.pushNumber' is signed (false).
     */
    public static boolean isSigned_body_initMsg_pushNumber() {
        return false;
    }

    /**
     * Return whether the field 'body.initMsg.pushNumber' is an array (false).
     */
    public static boolean isArray_body_initMsg_pushNumber() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.initMsg.pushNumber'
     */
    public static int offset_body_initMsg_pushNumber() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.initMsg.pushNumber'
     */
    public static int offsetBits_body_initMsg_pushNumber() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'body.initMsg.pushNumber'
     */
    public int get_body_initMsg_pushNumber() {
        return (int)getUIntBEElement(offsetBits_body_initMsg_pushNumber(), 16);
    }

    /**
     * Set the value of the field 'body.initMsg.pushNumber'
     */
    public void set_body_initMsg_pushNumber(int value) {
        setUIntBEElement(offsetBits_body_initMsg_pushNumber(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.initMsg.pushNumber'
     */
    public static int size_body_initMsg_pushNumber() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.initMsg.pushNumber'
     */
    public static int sizeBits_body_initMsg_pushNumber() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.initMsg.txPowerUAV
    //   Field type: short
    //   Offset (bits): 32
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.initMsg.txPowerUAV' is signed (false).
     */
    public static boolean isSigned_body_initMsg_txPowerUAV() {
        return false;
    }

    /**
     * Return whether the field 'body.initMsg.txPowerUAV' is an array (false).
     */
    public static boolean isArray_body_initMsg_txPowerUAV() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.initMsg.txPowerUAV'
     */
    public static int offset_body_initMsg_txPowerUAV() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.initMsg.txPowerUAV'
     */
    public static int offsetBits_body_initMsg_txPowerUAV() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'body.initMsg.txPowerUAV'
     */
    public short get_body_initMsg_txPowerUAV() {
        return (short)getUIntBEElement(offsetBits_body_initMsg_txPowerUAV(), 8);
    }

    /**
     * Set the value of the field 'body.initMsg.txPowerUAV'
     */
    public void set_body_initMsg_txPowerUAV(short value) {
        setUIntBEElement(offsetBits_body_initMsg_txPowerUAV(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.initMsg.txPowerUAV'
     */
    public static int size_body_initMsg_txPowerUAV() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.initMsg.txPowerUAV'
     */
    public static int sizeBits_body_initMsg_txPowerUAV() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.pushMsg.seqNumberPush
    //   Field type: int
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.pushMsg.seqNumberPush' is signed (false).
     */
    public static boolean isSigned_body_pushMsg_seqNumberPush() {
        return false;
    }

    /**
     * Return whether the field 'body.pushMsg.seqNumberPush' is an array (false).
     */
    public static boolean isArray_body_pushMsg_seqNumberPush() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.pushMsg.seqNumberPush'
     */
    public static int offset_body_pushMsg_seqNumberPush() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.pushMsg.seqNumberPush'
     */
    public static int offsetBits_body_pushMsg_seqNumberPush() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'body.pushMsg.seqNumberPush'
     */
    public int get_body_pushMsg_seqNumberPush() {
        return (int)getUIntBEElement(offsetBits_body_pushMsg_seqNumberPush(), 16);
    }

    /**
     * Set the value of the field 'body.pushMsg.seqNumberPush'
     */
    public void set_body_pushMsg_seqNumberPush(int value) {
        setUIntBEElement(offsetBits_body_pushMsg_seqNumberPush(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.pushMsg.seqNumberPush'
     */
    public static int size_body_pushMsg_seqNumberPush() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.pushMsg.seqNumberPush'
     */
    public static int sizeBits_body_pushMsg_seqNumberPush() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.pushMsg.lqMetricPush.RSSI
    //   Field type: short
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.RSSI' is signed (false).
     */
    public static boolean isSigned_body_pushMsg_lqMetricPush_RSSI() {
        return false;
    }

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.RSSI' is an array (false).
     */
    public static boolean isArray_body_pushMsg_lqMetricPush_RSSI() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.pushMsg.lqMetricPush.RSSI'
     */
    public static int offset_body_pushMsg_lqMetricPush_RSSI() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.pushMsg.lqMetricPush.RSSI'
     */
    public static int offsetBits_body_pushMsg_lqMetricPush_RSSI() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'body.pushMsg.lqMetricPush.RSSI'
     */
    public short get_body_pushMsg_lqMetricPush_RSSI() {
        return (short)getSIntBEElement(offsetBits_body_pushMsg_lqMetricPush_RSSI(), 16);
    }

    /**
     * Set the value of the field 'body.pushMsg.lqMetricPush.RSSI'
     */
    public void set_body_pushMsg_lqMetricPush_RSSI(short value) {
        setSIntBEElement(offsetBits_body_pushMsg_lqMetricPush_RSSI(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.pushMsg.lqMetricPush.RSSI'
     */
    public static int size_body_pushMsg_lqMetricPush_RSSI() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.pushMsg.lqMetricPush.RSSI'
     */
    public static int sizeBits_body_pushMsg_lqMetricPush_RSSI() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.pushMsg.lqMetricPush.LQI
    //   Field type: int
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.LQI' is signed (false).
     */
    public static boolean isSigned_body_pushMsg_lqMetricPush_LQI() {
        return false;
    }

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.LQI' is an array (false).
     */
    public static boolean isArray_body_pushMsg_lqMetricPush_LQI() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.pushMsg.lqMetricPush.LQI'
     */
    public static int offset_body_pushMsg_lqMetricPush_LQI() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.pushMsg.lqMetricPush.LQI'
     */
    public static int offsetBits_body_pushMsg_lqMetricPush_LQI() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'body.pushMsg.lqMetricPush.LQI'
     */
    public int get_body_pushMsg_lqMetricPush_LQI() {
        return (int)getUIntBEElement(offsetBits_body_pushMsg_lqMetricPush_LQI(), 16);
    }

    /**
     * Set the value of the field 'body.pushMsg.lqMetricPush.LQI'
     */
    public void set_body_pushMsg_lqMetricPush_LQI(int value) {
        setUIntBEElement(offsetBits_body_pushMsg_lqMetricPush_LQI(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.pushMsg.lqMetricPush.LQI'
     */
    public static int size_body_pushMsg_lqMetricPush_LQI() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.pushMsg.lqMetricPush.LQI'
     */
    public static int sizeBits_body_pushMsg_lqMetricPush_LQI() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.pushMsg.lqMetricPush.CRC
    //   Field type: int
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.CRC' is signed (false).
     */
    public static boolean isSigned_body_pushMsg_lqMetricPush_CRC() {
        return false;
    }

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.CRC' is an array (false).
     */
    public static boolean isArray_body_pushMsg_lqMetricPush_CRC() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.pushMsg.lqMetricPush.CRC'
     */
    public static int offset_body_pushMsg_lqMetricPush_CRC() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.pushMsg.lqMetricPush.CRC'
     */
    public static int offsetBits_body_pushMsg_lqMetricPush_CRC() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'body.pushMsg.lqMetricPush.CRC'
     */
    public int get_body_pushMsg_lqMetricPush_CRC() {
        return (int)getUIntBEElement(offsetBits_body_pushMsg_lqMetricPush_CRC(), 16);
    }

    /**
     * Set the value of the field 'body.pushMsg.lqMetricPush.CRC'
     */
    public void set_body_pushMsg_lqMetricPush_CRC(int value) {
        setUIntBEElement(offsetBits_body_pushMsg_lqMetricPush_CRC(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.pushMsg.lqMetricPush.CRC'
     */
    public static int size_body_pushMsg_lqMetricPush_CRC() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.pushMsg.lqMetricPush.CRC'
     */
    public static int sizeBits_body_pushMsg_lqMetricPush_CRC() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.pushMsg.lqMetricPush.noiseFlr
    //   Field type: int
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.noiseFlr' is signed (false).
     */
    public static boolean isSigned_body_pushMsg_lqMetricPush_noiseFlr() {
        return false;
    }

    /**
     * Return whether the field 'body.pushMsg.lqMetricPush.noiseFlr' is an array (false).
     */
    public static boolean isArray_body_pushMsg_lqMetricPush_noiseFlr() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.pushMsg.lqMetricPush.noiseFlr'
     */
    public static int offset_body_pushMsg_lqMetricPush_noiseFlr() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.pushMsg.lqMetricPush.noiseFlr'
     */
    public static int offsetBits_body_pushMsg_lqMetricPush_noiseFlr() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'body.pushMsg.lqMetricPush.noiseFlr'
     */
    public int get_body_pushMsg_lqMetricPush_noiseFlr() {
        return (int)getUIntBEElement(offsetBits_body_pushMsg_lqMetricPush_noiseFlr(), 16);
    }

    /**
     * Set the value of the field 'body.pushMsg.lqMetricPush.noiseFlr'
     */
    public void set_body_pushMsg_lqMetricPush_noiseFlr(int value) {
        setUIntBEElement(offsetBits_body_pushMsg_lqMetricPush_noiseFlr(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.pushMsg.lqMetricPush.noiseFlr'
     */
    public static int size_body_pushMsg_lqMetricPush_noiseFlr() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.pushMsg.lqMetricPush.noiseFlr'
     */
    public static int sizeBits_body_pushMsg_lqMetricPush_noiseFlr() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.pushMsg.tempUAV
    //   Field type: int
    //   Offset (bits): 96
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.pushMsg.tempUAV' is signed (false).
     */
    public static boolean isSigned_body_pushMsg_tempUAV() {
        return false;
    }

    /**
     * Return whether the field 'body.pushMsg.tempUAV' is an array (false).
     */
    public static boolean isArray_body_pushMsg_tempUAV() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.pushMsg.tempUAV'
     */
    public static int offset_body_pushMsg_tempUAV() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.pushMsg.tempUAV'
     */
    public static int offsetBits_body_pushMsg_tempUAV() {
        return 96;
    }

    /**
     * Return the value (as a int) of the field 'body.pushMsg.tempUAV'
     */
    public int get_body_pushMsg_tempUAV() {
        return (int)getUIntBEElement(offsetBits_body_pushMsg_tempUAV(), 16);
    }

    /**
     * Set the value of the field 'body.pushMsg.tempUAV'
     */
    public void set_body_pushMsg_tempUAV(int value) {
        setUIntBEElement(offsetBits_body_pushMsg_tempUAV(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.pushMsg.tempUAV'
     */
    public static int size_body_pushMsg_tempUAV() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.pushMsg.tempUAV'
     */
    public static int sizeBits_body_pushMsg_tempUAV() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: body.pushMsg.humidUAV
    //   Field type: int
    //   Offset (bits): 112
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'body.pushMsg.humidUAV' is signed (false).
     */
    public static boolean isSigned_body_pushMsg_humidUAV() {
        return false;
    }

    /**
     * Return whether the field 'body.pushMsg.humidUAV' is an array (false).
     */
    public static boolean isArray_body_pushMsg_humidUAV() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'body.pushMsg.humidUAV'
     */
    public static int offset_body_pushMsg_humidUAV() {
        return (112 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'body.pushMsg.humidUAV'
     */
    public static int offsetBits_body_pushMsg_humidUAV() {
        return 112;
    }

    /**
     * Return the value (as a int) of the field 'body.pushMsg.humidUAV'
     */
    public int get_body_pushMsg_humidUAV() {
        return (int)getUIntBEElement(offsetBits_body_pushMsg_humidUAV(), 16);
    }

    /**
     * Set the value of the field 'body.pushMsg.humidUAV'
     */
    public void set_body_pushMsg_humidUAV(int value) {
        setUIntBEElement(offsetBits_body_pushMsg_humidUAV(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'body.pushMsg.humidUAV'
     */
    public static int size_body_pushMsg_humidUAV() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'body.pushMsg.humidUAV'
     */
    public static int sizeBits_body_pushMsg_humidUAV() {
        return 16;
    }

}
