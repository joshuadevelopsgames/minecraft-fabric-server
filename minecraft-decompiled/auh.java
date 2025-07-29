import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class auh {
   public static final MapCodec<auh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            mm.aA.q().fieldOf("type").forGetter(auh::a),
            bbi.o.fieldOf("level").forGetter(auh::b),
            Codec.LONG.optionalFieldOf("ticks_left", 0L).forGetter($$0x -> $$0x.d)
         )
         .apply($$0, auh::new)
   );
   private final aui b;
   private final int c;
   private long d;

   public auh(aui $$0, int $$1) {
      this($$0, $$1, $$0.d());
   }

   private auh(aui $$0, int $$1, long $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public String toString() {
      return this.b.c()
         ? "Ticket[" + ag.a(mm.aA, this.b) + " " + this.c + "] with " + this.d + " ticks left ( out of" + this.b.d() + ")"
         : "Ticket[" + ag.a(mm.aA, this.b) + " " + this.c + "] with no timeout";
   }

   public aui a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public void c() {
      this.d = this.b.d();
   }

   public void d() {
      if (this.b.c()) {
         this.d--;
      }
   }

   public boolean e() {
      return this.b.c() && this.d < 0L;
   }
}
