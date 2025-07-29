import java.util.Optional;
import javax.annotation.Nullable;

public record ahh(jl<ehy> a, amd<dmu> b, long c, dmr d, @Nullable dmr e, boolean f, boolean g, Optional<jk> h, int i, int j) {
   public ahh(wx $$0) {
      this(
         ehy.i.decode($$0),
         $$0.a(mn.bu),
         $$0.readLong(),
         dmr.a($$0.readByte()),
         dmr.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wg::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wx $$0) {
      ehy.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dmr.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wg::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
