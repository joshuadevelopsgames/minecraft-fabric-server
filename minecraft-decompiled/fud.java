import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.logging.LogUtils;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fud {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 10000;
   private final fue c;
   private final fmv d = new fmv();
   private long e = -1L;
   private long f = -1L;
   private long g = -1L;
   private boolean h;

   public fud(fue $$0) {
      this.c = $$0;
   }

   private boolean a(int $$0) {
      switch ($$0) {
         case 69:
            this.c.C = !this.c.C;
            this.a("SectionPath: {0}", this.c.C ? "shown" : "hidden");
            return true;
         case 70:
            boolean $$2 = hnm.b();
            this.a("Fog: {0}", $$2 ? "enabled" : "disabled");
            return true;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 77:
         case 78:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         default:
            return false;
         case 76:
            this.c.E = !this.c.E;
            this.a("SmartCull: {0}", this.c.E ? "enabled" : "disabled");
            return true;
         case 79:
            boolean $$1 = this.c.l.c();
            this.a("Frustum culling Octree: {0}", $$1 ? "enabled" : "disabled");
            return true;
         case 85:
            if (get.t()) {
               this.c.f.m();
               this.a("Killed frustum");
            } else {
               this.c.f.l();
               this.a("Captured frustum");
            }

            return true;
         case 86:
            this.c.D = !this.c.D;
            this.a("SectionVisibility: {0}", this.c.D ? "enabled" : "disabled");
            return true;
         case 87:
            this.c.B = !this.c.B;
            this.a("WireFrame: {0}", this.c.B ? "enabled" : "disabled");
            return true;
      }
   }

   private void a(xo $$0) {
      this.c.m.e().a($$0);
      this.c.aZ().c($$0);
   }

   private static xo a(o $$0, xo $$1) {
      return xo.i().b(xo.c("debug.prefix").a($$0, o.r)).b(xn.w).b($$1);
   }

   private void b(xo $$0) {
      this.a(a(o.m, $$0));
   }

   private void c(xo $$0) {
      this.a(a(o.o, $$0));
   }

   private void b(String $$0) {
      this.c(xo.c($$0));
   }

   private void a(String $$0, Object... $$1) {
      this.c(xo.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.e > 0L && this.e < ag.c() - 100L) {
         return true;
      } else {
         switch ($$0) {
            case 49:
               this.c.aR().k();
               return true;
            case 50:
               this.c.aR().j();
               return true;
            case 51:
               this.c.aR().i();
               return true;
            case 65:
               this.c.f.d();
               this.b("debug.reload_chunks.message");
               return true;
            case 66:
               boolean $$1 = !this.c.ar().a();
               this.c.ar().b($$1);
               this.b($$1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.c.t.gK()) {
                  return false;
               } else {
                  grl $$7 = this.c.t.j;
                  if ($$7 == null) {
                     return false;
                  }

                  this.b("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.c.t.ai().aj().a(),
                        this.c.t.dC(),
                        this.c.t.dE(),
                        this.c.t.dI(),
                        this.c.t.dP(),
                        this.c.t.dR()
                     )
                  );
                  return true;
               }
            case 68:
               if (this.c.m != null) {
                  this.c.m.e().a(false);
               }

               return true;
            case 71:
               boolean $$2 = this.c.l.b();
               this.b($$2 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               this.c.n.m = !this.c.n.m;
               this.b(this.c.n.m ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               this.c.n.aC();
               return true;
            case 73:
               if (!this.c.t.gK()) {
                  this.a(this.c.t.s(2), !get.t());
               }

               return true;
            case 76:
               if (this.c.b(this::c)) {
                  this.c(xo.a("debug.profiling.start", 10));
               }

               return true;
            case 78:
               if (!this.c.t.s(2)) {
                  this.b("debug.creative_spectator.error");
               } else if (!this.c.t.am()) {
                  this.c.t.j.b(new ahr(dmr.d));
               } else {
                  dmr $$3 = (dmr)MoreObjects.firstNonNull(this.c.r.h(), dmr.b);
                  this.c.t.j.b(new ahr($$3));
               }

               return true;
            case 80:
               this.c.n.n = !this.c.n.n;
               this.c.n.aC();
               this.b(this.c.n.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.b("debug.help.message");
               this.a(xo.c("debug.reload_chunks.help"));
               this.a(xo.c("debug.show_hitboxes.help"));
               this.a(xo.c("debug.copy_location.help"));
               this.a(xo.c("debug.clear_chat.help"));
               this.a(xo.c("debug.chunk_boundaries.help"));
               this.a(xo.c("debug.advanced_tooltips.help"));
               this.a(xo.c("debug.inspect.help"));
               this.a(xo.c("debug.profiling.help"));
               this.a(xo.c("debug.creative_spectator.help"));
               this.a(xo.c("debug.pause_focus.help"));
               this.a(xo.c("debug.help.help"));
               this.a(xo.c("debug.dump_dynamic_textures.help"));
               this.a(xo.c("debug.reload_resourcepacks.help"));
               this.a(xo.c("debug.version.help"));
               this.a(xo.c("debug.pause.help"));
               this.a(xo.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.c.q.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.c.ab().a($$5);
               xo $$6 = xo.b($$4.relativize($$5).toString()).a(o.t).a($$1x -> $$1x.a(new xm.e($$5)));
               this.c(xo.a("debug.dump_dynamic_textures", $$6));
               return true;
            case 84:
               this.b("debug.reload_resourcepacks.message");
               this.c.l();
               return true;
            case 86:
               this.b("debug.version.header");
               aqu.a(this::a);
               return true;
            case 293:
               if (!this.c.t.s(2)) {
                  this.b("debug.gamemodes.error");
               } else {
                  this.c.a(new gff());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      fiq $$2 = this.c.w;
      if ($$2 != null) {
         switch ($$2.d()) {
            case b:
               jb $$3 = ((fio)$$2).b();
               dmu $$4 = this.c.t.ai();
               eeb $$5 = $$4.a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.c.t.j.u().a($$3, $$2x -> {
                        this.a($$5, $$3, $$2x);
                        this.b("debug.inspect.server.block");
                     });
                  } else {
                     eaz $$6 = $$4.c_($$3);
                     ui $$7 = $$6 != null ? $$6.c($$4.K_()) : null;
                     this.a($$5, $$3, $$7);
                     this.b("debug.inspect.client.block");
                  }
               } else {
                  this.a($$5, $$3, null);
                  this.b("debug.inspect.client.block");
               }
               break;
            case c:
               bzm $$8 = ((fip)$$2).a();
               ame $$9 = mm.f.b($$8.ap());
               if ($$0) {
                  if ($$1) {
                     this.c.t.j.u().a($$8.ar(), $$2x -> {
                        this.a($$9, $$8.dv(), $$2x);
                        this.b("debug.inspect.server.entity");
                     });
                  } else {
                     try (bci.j $$10 = new bci.j($$8.ef(), b)) {
                        fcz $$11 = fcz.a($$10, $$8.eb());
                        $$8.d($$11);
                        this.a($$9, $$8.dv(), $$11.b());
                     }

                     this.b("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$9, $$8.dv(), null);
                  this.b("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(eeb $$0, jb $$1, @Nullable ui $$2) {
      StringBuilder $$3 = new StringBuilder(gi.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(ame $$0, fis $$1, @Nullable ui $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         String $$3 = ux.b((vi)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.d, $$1.e, $$1.f, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.d, $$1.e, $$1.f);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.c.aP().h()) {
         this.c.aQ().d();
         boolean $$5 = fna.a(fue.R().aP().h(), 292);
         if (this.e > 0L) {
            if (!fna.a(fue.R().aP().h(), 67) || !$$5) {
               this.e = -1L;
            }
         } else if (fna.a(fue.R().aP().h(), 67) && $$5) {
            this.h = true;
            this.e = ag.c();
            this.f = ag.c();
            this.g = 0L;
         }

         get $$6 = this.c.z;
         if ($$6 != null) {
            switch ($$1) {
               case 258:
                  this.c.a(fub.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.c.a(fub.c);
            }
         }

         if ($$3 == 1 && (!(this.c.z instanceof gix) || ((gix)$$6).f <= ag.c() - 20L)) {
            if (this.c.n.P.a($$1, $$2)) {
               this.c.aP().g();
               boolean $$7 = this.c.aP().i();
               this.c.n.ae().a($$7);
               this.c.n.aC();
               if (this.c.z instanceof giu $$8) {
                  $$8.c($$7);
               }

               return;
            }

            if (this.c.n.M.a($$1, $$2)) {
               if (get.s()) {
               }

               fum.a(this.c.q, this.c.h(), $$0x -> this.c.execute(() -> this.a($$0x)));
               return;
            }
         }

         if ($$3 != 0) {
            boolean $$9 = $$6 == null || !($$6.aL_() instanceof fxx) || !((fxx)$$6.aL_()).c();
            if ($$9) {
               if (get.s() && $$1 == 66 && this.c.aZ().a() && this.c.n.x().c()) {
                  boolean $$10 = this.c.n.aw().c() == fug.a;
                  this.c.n.aw().a(fug.a(this.c.n.aw().c().a() + 1));
                  this.c.n.aC();
                  if ($$6 != null) {
                     $$6.e($$10);
                  }
               }

               gwi var17 = this.c.t;
            }
         }

         if ($$6 != null) {
            try {
               if ($$3 != 1 && $$3 != 2) {
                  if ($$3 == 0 && $$6.c($$1, $$2, $$4)) {
                     return;
                  }
               } else {
                  $$6.x();
                  if ($$6.a($$1, $$2, $$4)) {
                     return;
                  }
               }
            } catch (Throwable var14) {
               p $$12 = p.a(var14, "keyPressed event handler");
               $$6.a($$12);
               q $$13 = $$12.a("Key");
               $$13.a("Key", $$1);
               $$13.a("Scancode", $$2);
               $$13.a("Mods", $$4);
               throw new aa($$12);
            }
         }

         fna.a $$14 = fna.a($$1, $$2);
         boolean $$15 = this.c.z == null;
         boolean $$17 = $$15 || this.c.z instanceof geo $$16 && !$$16.l();
         if ($$3 == 0) {
            fuc.a($$14, false);
            if ($$17 && $$1 == 292) {
               if (this.h) {
                  this.h = false;
               } else {
                  this.c.aR().h();
               }
            }
         } else {
            boolean $$18 = false;
            if ($$17) {
               if ($$1 == 293 && this.c.j != null) {
                  this.c.j.d();
               }

               if ($$1 == 256) {
                  this.c.b($$5);
                  $$18 |= $$5;
               }

               $$18 |= $$5 && this.b($$1);
               this.h |= $$18;
               if ($$1 == 290) {
                  this.c.n.Y = !this.c.n.Y;
               }

               if (this.c.aR().e() && !$$5 && $$1 >= 48 && $$1 <= 57) {
                  this.c.aR().o().b($$1 - 48);
               }
            }

            if ($$15) {
               if ($$18) {
                  fuc.a($$14, false);
               } else {
                  fuc.a($$14, true);
                  fuc.a($$14);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.c.aP().h()) {
         get $$3 = this.c.z;
         if ($$3 != null && this.c.aN() == null) {
            try {
               if (Character.isBmpCodePoint($$1)) {
                  $$3.a((char)$$1, $$2);
               } else if (Character.isValidCodePoint($$1)) {
                  $$3.a(Character.highSurrogate($$1), $$2);
                  $$3.a(Character.lowSurrogate($$1), $$2);
               }
            } catch (Throwable var9) {
               p $$5 = p.a(var9, "charTyped event handler");
               $$3.a($$5);
               q $$6 = $$5.a("Key");
               $$6.a("Codepoint", $$1);
               $$6.a("Mods", $$2);
               throw new aa($$5);
            }
         }
      }
   }

   public void a(long $$0) {
      fna.a(
         $$0,
         ($$0x, $$1, $$2, $$3, $$4) -> this.c.execute(() -> this.a($$0x, $$1, $$2, $$3, $$4)),
         ($$0x, $$1, $$2) -> this.c.execute(() -> this.a($$0x, $$1, $$2))
      );
   }

   public String a() {
      return this.d.a(this.c.aP().h(), ($$0, $$1) -> {
         if ($$0 != 65545) {
            this.c.aP().a($$0, $$1);
         }
      });
   }

   public void a(String $$0) {
      if (!$$0.isEmpty()) {
         this.d.a(this.c.aP().h(), $$0);
      }
   }

   public void b() {
      if (this.e > 0L) {
         long $$0 = ag.c();
         long $$1 = 10000L - ($$0 - this.e);
         long $$2 = $$0 - this.f;
         if ($$1 < 0L) {
            if (get.s()) {
               fky.a();
            }

            String $$3 = "Manually triggered debug crash";
            p $$4 = new p("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            q $$5 = $$4.a("Manual crash details");
            bcc.a($$5);
            throw new aa($$4);
         }

         if ($$2 >= 1000L) {
            if (this.g == 0L) {
               this.b("debug.crash.message");
            } else {
               this.b(xo.a("debug.crash.warning", bcb.f((float)$$1 / 1000.0F)));
            }

            this.f = $$0;
            this.g++;
         }
      }
   }
}
