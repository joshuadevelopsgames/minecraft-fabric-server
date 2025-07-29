import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fep extends few {
   public static final bae<euy> a = baa.l;
   public static final jl<fcb> b = fcc.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<fep> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               bae.a(mn.bj).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
               fcb.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
               Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
               Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
               Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
            )
         )
         .apply($$0, fep::new)
   );
   private final bae<euy> h;
   private final jl<fcb> i;
   private final byte j;
   private final int k;
   private final boolean l;

   fep(List<fgs> $$0, bae<euy> $$1, jl<fcb> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public fey<fep> b() {
      return fez.q;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.f);
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if (!$$0.a(dcz.vL)) {
         return $$0;
      } else {
         fis $$2 = $$1.c(fgd.f);
         if ($$2 != null) {
            aub $$3 = $$1.d();
            jb $$4 = $$3.a(this.h, jb.a((jv)$$2), this.k, this.l);
            if ($$4 != null) {
               dcv $$5 = ddi.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               ddi.a($$3, $$5);
               fcg.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static fep.a c() {
      return new fep.a();
   }

   public static class a extends few.a<fep.a> {
      private bae<euy> a;
      private jl<fcb> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = fep.a;
         this.b = fep.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected fep.a a() {
         return this;
      }

      public fep.a a(bae<euy> $$0) {
         this.a = $$0;
         return this;
      }

      public fep.a a(jl<fcb> $$0) {
         this.b = $$0;
         return this;
      }

      public fep.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public fep.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fep.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fex b() {
         return new fep(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
