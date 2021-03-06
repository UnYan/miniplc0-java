package miniplc0java.instruction;

public enum Operation {
    nop(0x00),push(0x01),pop(0x02), popn(0x03), dup(0x04), loca(0x0a), arga(0x0b), globa(0x0c),
    load8(0x10), load16(0x11), load32(0x12), load64(0x13), store8(0x14), store16(0x15), store32(0x16),
    store64(0x17), alloc(0x18), free(0x19), stackalloc(0x1a), addi(0x20), subi(0x21), muli(0x22), divi(0x23),
    addf(0x24), subf(0x25), mulf(0x26), divf(0x27), divu(0x28), shl(0x29), shr(0x2a), and(0x2b), or(0x2c),
    xor(0x2d), not(0x2e), cmpi(0x30), cmpu(0x31), cmpf(0x32), negi(0x34), negf(0x35), itof(0x36), ftoi(0x37),
    shrl(0x38), setlt(0x39), setgt(0x3a), br(0x41), brfalse(0x42), brtrue(0x43), call(0x48), ret(0x49), callname(0x4a),
    ;

    private final int i;
    Operation(int i) {
        this.i = i;
    }
    public int getI(){
        return i;
    }

}
