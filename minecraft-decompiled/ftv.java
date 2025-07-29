import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class ftv {
   public static final xo a = xn.a;
   private static final Logger b = LogUtils.getLogger();
   private final fue c;
   private final Narrator d = Narrator.getNarrator();

   public ftv(fue $$0) {
      this.c = $$0;
   }

   public void a(xo $$0) {
      if (this.d().c()) {
         this.e($$0);
      }
   }

   public void b(xo $$0) {
      if (this.d().e()) {
         this.e($$0);
      }
   }

   public void c(xo $$0) {
      if (this.d().d()) {
         this.e($$0);
      }
   }

   private void e(xo $$0) {
      String $$1 = $$0.getString();
      if (!$$1.isEmpty()) {
         this.b($$1);
         this.a($$1, false);
      }
   }

   public void d(xo $$0) {
      this.a($$0.getString());
   }

   public void a(String $$0) {
      if (this.d().d() && !$$0.isEmpty()) {
         this.b($$0);
         if (this.d.active()) {
            this.d.clear();
            this.a($$0, true);
         }
      }
   }

   private void a(String $$0, boolean $$1) {
      this.d.say($$0, $$1, this.c.n.b(aza.j) * this.c.n.b(aza.a));
   }

   private fug d() {
      return this.c.n.aw().c();
   }

   private void b(String $$0) {
      if (ac.aZ) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fug $$0) {
      this.b();
      this.a(xo.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      gad $$1 = fue.R().aB();
      if (this.d.active()) {
         if ($$0 == fug.a) {
            gab.b($$1, gab.a.a, xo.c("narrator.toast.disabled"), null);
         } else {
            gab.b($$1, gab.a.a, xo.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         gab.b($$1, gab.a.a, xo.c("narrator.toast.disabled"), xo.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fug.a && this.d.active()) {
         this.d.clear();
      }
   }

   public void c() {
      this.d.destroy();
   }

   public void a(boolean $$0) {
      if ($$0
         && !this.a()
         && !TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Failed to initialize text-to-speech library. Do you want to continue?\nIf this problem persists, please report it at bugs.mojang.com",
            "yesno",
            "error",
            true
         )) {
         throw new ftv.a("Narrator library is not active");
      }
   }

   public static class a extends gln {
      public a(String $$0) {
         super($$0);
      }
   }
}
