/** 
* Create all of the primitives (except long and double) with different values. 
* Concatenate them into a string and  print it to the screen so it will print: 
* H3110 w0r1d 2.0 true
*
* @author Leo 
*/

package primitive_data_types;

class DataTypes{
    char _h, _w, _r, _d;
    int _int;
    byte _byte;
    short _short;
    float _float;
    boolean _bool;

    DataTypes(
        char char_H, 
        int number_3110,
        char char_w,
        byte byte_0, 
        char char_r, 
        short short_1,
        char char_d,
        float float_2,
        boolean bool_t
        ){
            this._h = char_H;
            this._int = number_3110;
            this._w = char_w;
            this._byte = byte_0;
            this._r = char_r;
            this._short = short_1;
            this._d = char_d;
            this._float = float_2;
            this._bool = bool_t;
    }

    protected void concatinate(){
        System.out.println("" + _h + _int + " " + _w + _byte + _r + _short + _d + " " + _float + " " + _bool);

    }
}

/*
PROBLEM BREAKDOWN: 
    Primitive data types that will be used
    boolean, byte, short, int, float, char; 
    H = char,
    3110 = int,
    w = char,
    0 = byte,
    r = char,
    1 = short,
    d = char
    2.0f = float,
    true = boolean,
*/

public class PrimitiveDataTypes{
    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes('H', 3110, 'w', (byte) 0, 'r', (short) 1, 'd', 2.0f, true);
        dataTypes.concatinate();
    }
}
