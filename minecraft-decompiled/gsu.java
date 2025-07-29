import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gsu extends gsp {
   final Supplier<hst> g;

   gsu(UUID $$0, Instant $$1, UUID $$2, Supplier<hst> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hst> a() {
      return this.g;
   }

   public gsu c() {
      gsu $$0 = new gsu(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public get a(get $$0, gst $$1) {
      return new gjz($$0, $$1, this);
   }

   public static class a extends gsp.a<gsu> {
      public a(gsu $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hst> $$1, AbuseReportLimits $$2) {
         super(new gsu(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gsp.b c() {
         if (this.a.e == null) {
            return gsp.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gsp.b.d : super.c();
         }
      }

      @Override
      public Either<gsp.c, gsp.b> a(gst $$0) {
         gsp.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hst $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gsp.c(this.a.a, gss.b, $$6));
         }
      }
   }
}
