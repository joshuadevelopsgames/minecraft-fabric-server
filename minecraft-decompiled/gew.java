import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class gew extends get {
   private static final ame a = ame.b("textures/misc/credits_vignette.png");
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.b("============").a(o.p);
   private static final String d = "           ";
   private static final String e = "" + o.p + o.q + o.k + o.l;
   private static final float f = 5.0F;
   private static final float u = 15.0F;
   private static final ame v = ame.b("texts/end.txt");
   private static final ame w = ame.b("texts/credits.json");
   private static final ame x = ame.b("texts/postcredits.txt");
   private final boolean y;
   private final Runnable z;
   private float A;
   private List<bbm> B;
   private List<xo> C;
   private IntSet D;
   private int E;
   private boolean F;
   private final IntSet G = new IntOpenHashSet();
   private float H;
   private final float I;
   private int J;
   private final fyg K = new fyg(false);

   public gew(boolean $$0, Runnable $$1) {
      super(ftv.a);
      this.y = $$0;
      this.z = $$1;
      if (!$$0) {
         this.I = 0.75F;
      } else {
         this.I = 0.5F;
      }

      this.J = 1;
      this.H = this.I;
   }

   private float l() {
      return this.F ? this.I * (5.0F + this.G.size() * 15.0F) * this.J : this.I * this.J;
   }

   @Override
   public void e() {
      this.n.s().a();
      this.n.al().a(false);
      float $$0 = this.E + this.p + this.p + 24;
      if (this.A > $$0) {
         this.m();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.J = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.G.add($$0);
      } else if ($$0 == 32) {
         this.F = true;
      }

      this.H = this.l();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.J = 1;
      }

      if ($$0 == 32) {
         this.F = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.G.remove($$0);
      }

      this.H = this.l();
      return super.c($$0, $$1, $$2);
   }

   @Override
   public void aP_() {
      this.m();
   }

   private void m() {
      this.z.run();
   }

   @Override
   protected void aV_() {
      if (this.B == null) {
         this.B = Lists.newArrayList();
         this.C = Lists.newArrayList();
         this.D = new IntOpenHashSet();
         if (this.y) {
            this.a(v, this::a);
         }

         this.a(w, this::b);
         if (this.y) {
            this.a(x, this::a);
         }

         this.E = this.B.size() * 12;
      }
   }

   @Override
   public xo i() {
      return xn.a(this.C.toArray(xo[]::new));
   }

   private void a(ame $$0, gew.a $$1) {
      try (Reader $$2 = this.n.ad().openAsReader($$0)) {
         $$1.read($$2);
      } catch (Exception var8) {
         b.error("Couldn't load credits from file {}", $$0, var8);
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      bck $$2 = bck.a(8124371L);

      String $$3;
      while (($$3 = $$1.readLine()) != null) {
         $$3 = $$3.replaceAll("PLAYERNAME", this.n.Y().c());

         int $$4;
         while (($$4 = $$3.indexOf(e)) != -1) {
            String $$5 = $$3.substring(0, $$4);
            String $$6 = $$3.substring($$4 + e.length());
            $$3 = $$5 + o.p + o.q + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
         }

         this.a($$3);
         this.n();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.n();
      }
   }

   private void b(Reader $$0) {
      for (JsonElement $$2 : bbq.b($$0)) {
         JsonObject $$3 = $$2.getAsJsonObject();
         String $$4 = $$3.get("section").getAsString();
         this.a(c, true, false);
         this.a(xo.b($$4).a(o.o), true, true);
         this.a(c, true, false);
         this.n();
         this.n();

         for (JsonElement $$6 : $$3.getAsJsonArray("disciplines")) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = $$7.get("discipline").getAsString();
            if (StringUtils.isNotEmpty($$8)) {
               this.a(xo.b($$8).a(o.o), true, true);
               this.n();
               this.n();
            }

            for (JsonElement $$10 : $$7.getAsJsonArray("titles")) {
               JsonObject $$11 = $$10.getAsJsonObject();
               String $$12 = $$11.get("title").getAsString();
               JsonArray $$13 = $$11.getAsJsonArray("names");
               this.a(xo.b($$12).a(o.h), false, true);

               for (JsonElement $$14 : $$13) {
                  String $$15 = $$14.getAsString();
                  this.a(xo.b("           ").f($$15).a(o.p), false, true);
               }

               this.n();
               this.n();
            }
         }
      }
   }

   private void n() {
      this.B.add(bbm.a);
      this.C.add(xn.a);
   }

   private void a(String $$0) {
      xo $$1 = xo.b($$0);
      this.B.addAll(this.n.h.c($$1, 256));
      this.C.add($$1);
   }

   private void a(xo $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         this.D.add(this.B.size());
      }

      this.B.add($$0.g());
      if ($$2) {
         this.C.add($$0);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0);
      this.A = Math.max(0.0F, this.A + $$3 * this.H);
      int $$4 = this.o / 2 - 128;
      int $$5 = this.p + 50;
      float $$6 = -this.A;
      $$0.e().pushMatrix();
      $$0.e().translate(0.0F, $$6);
      $$0.c();
      this.K.a($$0, this.o, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.B.size(); $$8++) {
         if ($$8 == this.B.size() - 1) {
            float $$9 = $$7 + $$6 - (this.p / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.e().translate(0.0F, -$$9);
            }
         }

         if ($$7 + $$6 + 12.0F + 8.0F > 0.0F && $$7 + $$6 < this.p) {
            bbm $$10 = this.B.get($$8);
            if (this.D.contains($$8)) {
               $$0.a(this.q, $$10, $$4 + 128, $$7, -1);
            } else {
               $$0.b(this.q, $$10, $$4, $$7, -1);
            }
         }

         $$7 += 12;
      }

      $$0.e().popMatrix();
   }

   private void d(fxb $$0) {
      $$0.a(gxx.ax, a, 0, 0, 0.0F, 0.0F, this.o, this.p, this.o, this.p);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.y) {
         hru $$4 = fue.R().ab();
         gch $$5 = gch.a($$4.b(haw.a).b(), $$4.b(haw.b).b());
         $$0.a(gxx.R, $$5, 0, 0, this.o, this.p);
      } else {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected void a(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
      float $$5 = this.A * 0.5F;
      get.a($$0, get.g, 0, 0, 0.0F, $$5, $$3, $$4);
   }

   @Override
   public boolean aQ_() {
      return !this.y;
   }

   @Override
   public void aI_() {
      this.n.s().a(ayx.c);
   }

   @Override
   public ayw D() {
      return ayx.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
