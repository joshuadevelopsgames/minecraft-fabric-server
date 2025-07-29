import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class axc extends awt {
   private static final awp d = new awp(xo.c("dataPack.vanilla.description"), ac.b().a(awd.b), Optional.empty());
   private static final avx e = new avx(cyf.h);
   private static final avt f = avt.a(awp.b, d, avx.a, e);
   private static final awa g = new awa("vanilla", xo.c("dataPack.vanilla.name"), axa.c, Optional.of(c));
   private static final awc h = new awc(false, aww.b.b, false);
   private static final awc i = new awc(false, aww.b.a, false);
   private static final ame j = ame.b("datapacks");

   public axc(fii $$0) {
      super(awd.b, b(), j, $$0);
   }

   private static awa a(String $$0, xo $$1) {
      return new awa($$0, $$1, axa.d, Optional.of(awv.a($$0)));
   }

   @VisibleForTesting
   public static awf b() {
      return new awg().a(f).a("minecraft").b().a().a(g);
   }

   @Override
   protected xo a(String $$0) {
      return xo.b($$0);
   }

   @Nullable
   @Override
   protected aww a(awb $$0) {
      return aww.a(g, b($$0), awd.b, h);
   }

   @Nullable
   @Override
   protected aww a(String $$0, aww.c $$1, xo $$2) {
      return aww.a(a($$0, $$2), $$1, awd.b, i);
   }

   public static awz a(Path $$0, fii $$1) {
      return new awz(new axc($$1), new awu($$0, awd.b, axa.e, $$1));
   }

   public static awz c() {
      return new awz(new axc(new fii($$0 -> true)));
   }

   public static awz a(fcs.c $$0) {
      return a($$0.a(fcq.j), $$0.d().e());
   }
}
