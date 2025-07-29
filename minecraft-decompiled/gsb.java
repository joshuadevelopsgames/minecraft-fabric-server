import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gsb {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<wd> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final grz $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final gtc $$3 = gtc.a($$0.b);
      Optional<InetSocketAddress> $$4 = gte.a.a($$3).map(gtb::d);
      if ($$4.isEmpty()) {
         this.a(gds.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final wd $$6 = wd.a($$5, false, null);
         this.c.add($$6);
         $$0.d = xo.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         akz $$7 = new akz() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(ala $$0x) {
               if (this.i) {
                  $$6.a(xo.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  alb $$1x = $$0.b();
                  $$0.d = $$1x.a();
                  $$1x.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = xo.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = xo.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1x.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = gsb.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<xo> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(xo.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(xo.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = xo.c("multiplayer.status.unknown").a(o.i));
                  $$1x.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(grz.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = ag.c();
                  $$6.a(new akx(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(aku $$0x) {
               long $$1x = this.j;
               long $$2x = ag.c();
               $$0.f = $$2x - $$1x;
               $$6.a(xo.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(wf $$0x) {
               if (!this.h) {
                  gsb.this.a($$0.a(), $$0);
                  gsb.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.i();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(ald.a);
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(xo $$0, grz $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = xn.a;
   }

   void a(InetSocketAddress $$0, final gtc $$1, final grz $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)wd.e.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new grs($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(grz.b.d);
               $$2.h = xo.b($$2xx);
               $$2.d = xo.b($$3);
               $$2.c = gsb.a($$4, $$5);
               $$2.e = new alb.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static xo a(int $$0, int $$1) {
      xo $$2 = xo.b(Integer.toString($$0)).a(o.h);
      xo $$3 = xo.b(Integer.toString($$1)).a(o.h);
      return xo.a("multiplayer.status.player_count", $$2, $$3).a(o.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<wd> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            wd $$1 = $$0.next();
            if ($$1.i()) {
               $$1.b();
            } else {
               $$0.remove();
               $$1.n();
            }
         }
      }
   }

   public void b() {
      synchronized (this.c) {
         Iterator<wd> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            wd $$1 = $$0.next();
            if ($$1.i()) {
               $$0.remove();
               $$1.a(xo.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
