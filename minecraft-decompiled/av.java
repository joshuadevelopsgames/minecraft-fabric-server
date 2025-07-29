import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            dcv.d.fieldOf("icon").forGetter(av::c),
            xq.a.fieldOf("title").forGetter(av::a),
            xq.a.fieldOf("description").forGetter(av::b),
            jc.a.optionalFieldOf("background").forGetter(av::d),
            ap.d.optionalFieldOf("frame", ap.a).forGetter(av::e),
            Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(av::h),
            Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(av::i),
            Codec.BOOL.optionalFieldOf("hidden", false).forGetter(av::j)
         )
         .apply($$0, av::new)
   );
   public static final zm<wx, av> b = zm.a(av::a, av::b);
   private final xo c;
   private final xo d;
   private final dcv e;
   private final Optional<jc> f;
   private final ap g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public av(dcv $$0, xo $$1, xo $$2, Optional<jc> $$3, ap $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.c = $$1;
      this.d = $$2;
      this.e = $$0;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   public void a(float $$0, float $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public xo a() {
      return this.c;
   }

   public xo b() {
      return this.d;
   }

   public dcv c() {
      return this.e;
   }

   public Optional<jc> d() {
      return this.f;
   }

   public ap e() {
      return this.g;
   }

   public float f() {
      return this.k;
   }

   public float g() {
      return this.l;
   }

   public boolean h() {
      return this.h;
   }

   public boolean i() {
      return this.i;
   }

   public boolean j() {
      return this.j;
   }

   private void a(wx $$0) {
      xq.d.encode($$0, this.c);
      xq.d.encode($$0, this.d);
      dcv.j.encode($$0, this.e);
      $$0.a(this.g);
      int $$1 = 0;
      if (this.f.isPresent()) {
         $$1 |= 1;
      }

      if (this.h) {
         $$1 |= 2;
      }

      if (this.j) {
         $$1 |= 4;
      }

      $$0.q($$1);
      this.f.map(jc::a).ifPresent($$0::a);
      $$0.a(this.k);
      $$0.a(this.l);
   }

   private static av b(wx $$0) {
      xo $$1 = xq.d.decode($$0);
      xo $$2 = xq.d.decode($$0);
      dcv $$3 = dcv.j.decode($$0);
      ap $$4 = $$0.b(ap.class);
      int $$5 = $$0.readInt();
      Optional<jc> $$6 = ($$5 & 1) != 0 ? Optional.of(new jc($$0.q())) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      av $$9 = new av($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
