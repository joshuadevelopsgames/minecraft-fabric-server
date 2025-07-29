import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gsp {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gsr e;
   protected boolean f;

   public gsp(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gsp b();

   public abstract get a(get var1, gst var2);

   public abstract static class a<R extends gsp> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public boolean h() {
         return this.e().f;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public gsr i() {
         return this.a.e;
      }

      public void a(gsr $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gsp.b c() {
         return !this.e().f ? gsp.b.e : null;
      }

      public abstract Either<gsp.c, gsp.b> a(gst var1);
   }

   public record b(xo f) {
      public static final gsp.b a = new gsp.b(xo.c("gui.abuseReport.send.no_reason"));
      public static final gsp.b b = new gsp.b(xo.c("gui.chatReport.send.no_reported_messages"));
      public static final gsp.b c = new gsp.b(xo.c("gui.chatReport.send.too_many_messages"));
      public static final gsp.b d = new gsp.b(xo.c("gui.abuseReport.send.comment_too_long"));
      public static final gsp.b e = new gsp.b(xo.c("gui.abuseReport.send.not_attested"));

      public fzb a() {
         return fzb.a(this.f);
      }

      public xo b() {
         return this.f;
      }
   }

   public record c(UUID a, gss b, AbuseReport c) {
   }
}
