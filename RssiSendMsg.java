/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'RssiSendMsg'
 * message type.
 */

public class RssiSendMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 5;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 6;

    /** Create a new RssiSendMsg of size 5. */
    public RssiSendMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new RssiSendMsg of the given data_length. */
    public RssiSendMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RssiSendMsg with the given data_length
     * and base offset.
     */
    public RssiSendMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RssiSendMsg using the given byte array
     * as backing store.
     */
    public RssiSendMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RssiSendMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public RssiSendMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RssiSendMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public RssiSendMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RssiSendMsg embedded in the given message
     * at the given base offset.
     */
    public RssiSendMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RssiSendMsg embedded in the given message
     * at the given base offset and length.
     */
    public RssiSendMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <RssiSendMsg> \n";
      try {
        s += "  [nodeid=0x"+Long.toHexString(get_nodeid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [power=0x"+Long.toHexString(get_power())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [rssi=0x"+Long.toHexString(get_rssi())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lqi=0x"+Long.toHexString(get_lqi())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nodeid
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeid' is signed (false).
     */
    public static boolean isSigned_nodeid() {
        return false;
    }

    /**
     * Return whether the field 'nodeid' is an array (false).
     */
    public static boolean isArray_nodeid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodeid'
     */
    public static int offset_nodeid() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodeid'
     */
    public static int offsetBits_nodeid() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'nodeid'
     */
    public int get_nodeid() {
        return (int)getUIntBEElement(offsetBits_nodeid(), 16);
    }

    /**
     * Set the value of the field 'nodeid'
     */
    public void set_nodeid(int value) {
        setUIntBEElement(offsetBits_nodeid(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodeid'
     */
    public static int size_nodeid() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodeid'
     */
    public static int sizeBits_nodeid() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: power
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'power' is signed (false).
     */
    public static boolean isSigned_power() {
        return false;
    }

    /**
     * Return whether the field 'power' is an array (false).
     */
    public static boolean isArray_power() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'power'
     */
    public static int offset_power() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'power'
     */
    public static int offsetBits_power() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'power'
     */
    public short get_power() {
        return (short)getUIntBEElement(offsetBits_power(), 8);
    }

    /**
     * Set the value of the field 'power'
     */
    public void set_power(short value) {
        setUIntBEElement(offsetBits_power(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'power'
     */
    public static int size_power() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'power'
     */
    public static int sizeBits_power() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rssi
    //   Field type: byte, unsigned
    //   Offset (bits): 24
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rssi' is signed (false).
     */
    public static boolean isSigned_rssi() {
        return false;
    }

    /**
     * Return whether the field 'rssi' is an array (false).
     */
    public static boolean isArray_rssi() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rssi'
     */
    public static int offset_rssi() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rssi'
     */
    public static int offsetBits_rssi() {
        return 24;
    }

    /**
     * Return the value (as a byte) of the field 'rssi'
     */
    public byte get_rssi() {
        return (byte)getSIntBEElement(offsetBits_rssi(), 8);
    }

    /**
     * Set the value of the field 'rssi'
     */
    public void set_rssi(byte value) {
        setSIntBEElement(offsetBits_rssi(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'rssi'
     */
    public static int size_rssi() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rssi'
     */
    public static int sizeBits_rssi() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lqi
    //   Field type: short, unsigned
    //   Offset (bits): 32
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lqi' is signed (false).
     */
    public static boolean isSigned_lqi() {
        return false;
    }

    /**
     * Return whether the field 'lqi' is an array (false).
     */
    public static boolean isArray_lqi() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lqi'
     */
    public static int offset_lqi() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lqi'
     */
    public static int offsetBits_lqi() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'lqi'
     */
    public short get_lqi() {
        return (short)getUIntBEElement(offsetBits_lqi(), 8);
    }

    /**
     * Set the value of the field 'lqi'
     */
    public void set_lqi(short value) {
        setUIntBEElement(offsetBits_lqi(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'lqi'
     */
    public static int size_lqi() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lqi'
     */
    public static int sizeBits_lqi() {
        return 8;
    }

}