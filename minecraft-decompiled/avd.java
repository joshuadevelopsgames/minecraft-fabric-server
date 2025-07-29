import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class avd extends avc implements acg, xc {
   private static final Logger f = LogUtils.getLogger();
   private static final xo g = xo.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile h;
   private final Queue<aus> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private aus j;
   private atl k;
   @Nullable
   private avo l;

   public avd(MinecraftServer $$0, wd $$1, aur $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.k = $$2.c();
   }

   @Override
   protected GameProfile i() {
      return this.h;
   }

   @Override
   public void a(wf $$0) {
      f.info("{} lost connection: {}", this.h, $$0.a().getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.e.i();
   }

   @Override
   public void l() {
      this.b(new aag(new abc(this.d.getServerModName())));
      amw $$0 = this.d.bp();
      if (!$$0.a()) {
         this.b(new aan($$0.b()));
      }

      js<amn> $$1 = this.d.bb();
      List<awv> $$2 = this.d.be().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new acd(cyf.e.b(this.d.aZ().K())));
      this.l = new avo($$2, $$1);
      this.i.add(this.l);
      this.n();
      this.i.add(new avm());
      this.o();
   }

   public void m() {
      this.i.add(new avm());
      this.o();
   }

   private void n() {
      this.d.Y().ifPresent($$0 -> this.i.add(new avn($$0)));
   }

   @Override
   public void a(aau $$0) {
      this.k = $$0.b();
   }

   @Override
   public void a(aaz $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(avn.a);
      }
   }

   @Override
   public void a(aci $$0) {
      zz.a($$0, this, this.d);
      if (this.l == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.l.a($$0.b(), this::b);
         this.a(avo.a);
      }
   }

   @Override
   public void a(ach $$0) {
      zz.a($$0, this, this.d);
      this.a(avm.a);
      this.e.a(ahl.c.a(wx.a(this.d.ba())));

      try {
         ayb $$1 = this.d.ag();
         if ($$1.a(this.h.getId()) != null) {
            this.a(ayb.f);
            return;
         }

         xo $$2 = $$1.a(this.e.d(), this.h);
         if ($$2 != null) {
            this.a($$2);
            return;
         }

         auc $$3 = new auc(this.d, this.d.J(), this.h, this.k);
         $$1.a(this.e, $$3, this.a(this.k));
      } catch (Exception var5) {
         f.error("Couldn't place player in world", var5);
         this.e.a(new aai(g));
         this.e.a(g);
      }
   }

   @Override
   public void d() {
      this.e();
   }

   private void o() {
      if (this.j != null) {
         throw new IllegalStateException("Task " + this.j.a().a() + " has not finished yet");
      } else if (this.c()) {
         aus $$0 = this.i.poll();
         if ($$0 != null) {
            this.j = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(aus.a $$0) {
      aus.a $$1 = this.j != null ? this.j.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.j = null;
         this.o();
      }
   }
}
