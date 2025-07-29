import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gst {
   private static final int a = 1024;
   private final gsk b;
   private final gsq c;
   private final gsf d;
   @Nullable
   private gsp e;

   public gst(gsk $$0, gsq $$1, gsf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gst a(gsq $$0, UserApiService $$1) {
      gsf $$2 = new gsf(1024);
      gsk $$3 = gsk.a($$0, $$1);
      return new gst($$3, $$0, $$2);
   }

   public void a(fue $$0, get $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gsp $$4 = this.e.b();
         $$0.a(
            new gdr(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xo.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xo.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xo.c("gui.abuseReport.draft.edit"),
               xo.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gsk a() {
      return this.b;
   }

   public gsf b() {
      return this.d;
   }

   public boolean a(gsq $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gsp $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
