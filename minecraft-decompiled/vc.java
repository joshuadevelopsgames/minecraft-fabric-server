import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.primitives.UnsignedBytes;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.chars.CharList;
import java.nio.ByteBuffer;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class vc {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("snbt.parser.number_parse_failure", $$0));
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("snbt.parser.expected_hex_escape", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("snbt.parser.invalid_codepoint", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("snbt.parser.no_such_operation", $$0));
   static final bsm<CommandSyntaxException> e = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.expected_integer_type")));
   private static final bsm<CommandSyntaxException> f = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.expected_float_type")));
   static final bsm<CommandSyntaxException> g = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.expected_non_negative_number")));
   private static final bsm<CommandSyntaxException> h = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.invalid_character_name")));
   static final bsm<CommandSyntaxException> i = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.invalid_array_element_type")));
   private static final bsm<CommandSyntaxException> j = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.invalid_unquoted_start")));
   private static final bsm<CommandSyntaxException> k = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.expected_unquoted_string")));
   private static final bsm<CommandSyntaxException> l = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.invalid_string_contents")));
   private static final bsm<CommandSyntaxException> m = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.expected_binary_numeral")));
   private static final bsm<CommandSyntaxException> n = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.underscore_not_allowed")));
   private static final bsm<CommandSyntaxException> o = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.expected_decimal_numeral")));
   private static final bsm<CommandSyntaxException> p = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.expected_hex_numeral")));
   private static final bsm<CommandSyntaxException> q = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.empty_key")));
   private static final bsm<CommandSyntaxException> r = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.leading_zero_not_allowed")));
   private static final bsm<CommandSyntaxException> s = bsm.a(new SimpleCommandExceptionType(xo.c("snbt.parser.infinity_not_allowed")));
   private static final HexFormat t = HexFormat.of().withUpperCase();
   private static final bta u = new bta(m, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bta v = new bta(o, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bta w = new bta(p, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '_', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
         };
      }
   };
   private static final bsz x = new bsz(1, l) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '"', '\'', '\\' -> false;
            default -> true;
         };
      }
   };
   private static final btg.a y = new btg.a(CharList.of()) {
      @Override
      protected boolean a(char $$0) {
         return vc.c($$0);
      }
   };
   private static final Pattern z = Pattern.compile("[-a-zA-Z0-9 ]+");

   static bsm<CommandSyntaxException> a(NumberFormatException $$0) {
      return bsm.a(a, $$0.getMessage());
   }

   @Nullable
   public static String a(char $$0) {
      return switch ($$0) {
         case '\b' -> "b";
         case '\t' -> "t";
         case '\n' -> "n";
         default -> $$0 < ' ' ? "x" + t.toHexDigits((byte)$$0) : null;
         case '\f' -> "f";
         case '\r' -> "r";
      };
   }

   private static boolean b(char $$0) {
      return !c($$0);
   }

   static boolean c(char $$0) {
      return switch ($$0) {
         case '+', '-', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
         default -> false;
      };
   }

   static boolean a(String $$0) {
      return $$0.indexOf(95) != -1;
   }

   private static void a(StringBuilder $$0, String $$1) {
      a($$0, $$1, a($$1));
   }

   static void a(StringBuilder $$0, String $$1, boolean $$2) {
      if ($$2) {
         for (char $$3 : $$1.toCharArray()) {
            if ($$3 != '_') {
               $$0.append($$3);
            }
         }
      } else {
         $$0.append($$1);
      }
   }

   static short a(String $$0, int $$1) {
      int $$2 = Integer.parseInt($$0, $$1);
      if ($$2 >> 16 == 0) {
         return (short)$$2;
      } else {
         throw new NumberFormatException("out of range: " + $$2);
      }
   }

   @Nullable
   private static <T> T a(DynamicOps<T> $$0, vc.e $$1, @Nullable String $$2, @Nullable String $$3, @Nullable vc.f<String> $$4, @Nullable vc.i $$5, bsr<?> $$6) {
      StringBuilder $$7 = new StringBuilder();
      $$1.a($$7);
      if ($$2 != null) {
         a($$7, $$2);
      }

      if ($$3 != null) {
         $$7.append('.');
         a($$7, $$3);
      }

      if ($$4 != null) {
         $$7.append('e');
         $$4.a().a($$7);
         a($$7, $$4.b);
      }

      try {
         String $$8 = $$7.toString();

         return (T)(switch ($$5) {
            case null -> (Object)b($$0, $$6, $$8);
            case FLOAT -> (Object)a($$0, $$6, $$8);
            case DOUBLE -> (Object)b($$0, $$6, $$8);
            default -> {
               $$6.b().a($$6.g(), f);
               yield null;
            }
         });
      } catch (NumberFormatException var11) {
         $$6.b().a($$6.g(), a(var11));
         return null;
      }
   }

   @Nullable
   private static <T> T a(DynamicOps<T> $$0, bsr<?> $$1, String $$2) {
      float $$3 = Float.parseFloat($$2);
      if (!Float.isFinite($$3)) {
         $$1.b().a($$1.g(), s);
         return null;
      } else {
         return (T)$$0.createFloat($$3);
      }
   }

   @Nullable
   private static <T> T b(DynamicOps<T> $$0, bsr<?> $$1, String $$2) {
      double $$3 = Double.parseDouble($$2);
      if (!Double.isFinite($$3)) {
         $$1.b().a($$1.g(), s);
         return null;
      } else {
         return (T)$$0.createDouble($$3);
      }
   }

   private static String a(List<String> $$0) {
      return switch ($$0.size()) {
         case 0 -> "";
         case 1 -> (String)$$0.getFirst();
         default -> String.join("", $$0);
      };
   }

   public static <T> bsx<T> a(DynamicOps<T> $$0) {
      T $$1 = (T)$$0.createBoolean(true);
      T $$2 = (T)$$0.createBoolean(false);
      T $$3 = (T)$$0.emptyMap();
      T $$4 = (T)$$0.emptyList();
      bsn<StringReader> $$5 = new bsn<>();
      bsj<vc.e> $$6 = bsj.a("sign");
      $$5.a($$6, bsv.b(bsv.a(btg.a('+'), bsv.a($$6, vc.e.a)), bsv.a(btg.a('-'), bsv.a($$6, vc.e.b))), $$1x -> $$1x.b($$6));
      bsj<vc.d> $$7 = bsj.a("integer_suffix");
      $$5.a(
         $$7,
         bsv.b(
            bsv.a(
               btg.a('u', 'U'),
               bsv.b(
                  bsv.a(btg.a('b', 'B'), bsv.a($$7, new vc.d(vc.g.b, vc.i.c))),
                  bsv.a(btg.a('s', 'S'), bsv.a($$7, new vc.d(vc.g.b, vc.i.d))),
                  bsv.a(btg.a('i', 'I'), bsv.a($$7, new vc.d(vc.g.b, vc.i.e))),
                  bsv.a(btg.a('l', 'L'), bsv.a($$7, new vc.d(vc.g.b, vc.i.f)))
               )
            ),
            bsv.a(
               btg.a('s', 'S'),
               bsv.b(
                  bsv.a(btg.a('b', 'B'), bsv.a($$7, new vc.d(vc.g.a, vc.i.c))),
                  bsv.a(btg.a('s', 'S'), bsv.a($$7, new vc.d(vc.g.a, vc.i.d))),
                  bsv.a(btg.a('i', 'I'), bsv.a($$7, new vc.d(vc.g.a, vc.i.e))),
                  bsv.a(btg.a('l', 'L'), bsv.a($$7, new vc.d(vc.g.a, vc.i.f)))
               )
            ),
            bsv.a(btg.a('b', 'B'), bsv.a($$7, new vc.d(null, vc.i.c))),
            bsv.a(btg.a('s', 'S'), bsv.a($$7, new vc.d(null, vc.i.d))),
            bsv.a(btg.a('i', 'I'), bsv.a($$7, new vc.d(null, vc.i.e))),
            bsv.a(btg.a('l', 'L'), bsv.a($$7, new vc.d(null, vc.i.f)))
         ),
         $$1x -> $$1x.b($$7)
      );
      bsj<String> $$8 = bsj.a("binary_numeral");
      $$5.a($$8, u);
      bsj<String> $$9 = bsj.a("decimal_numeral");
      $$5.a($$9, v);
      bsj<String> $$10 = bsj.a("hex_numeral");
      $$5.a($$10, w);
      bsj<vc.c> $$11 = bsj.a("integer_literal");
      bsq<StringReader, vc.c> $$12 = $$5.a(
         $$11,
         bsv.a(
            bsv.a($$5.c($$6)),
            bsv.b(
               bsv.a(
                  btg.a('0'),
                  bsv.c(),
                  bsv.b(bsv.a(btg.a('x', 'X'), bsv.c(), $$5.c($$10)), bsv.a(btg.a('b', 'B'), $$5.c($$8)), bsv.a($$5.c($$9), bsv.c(), bsv.a(r)), bsv.a($$9, "0"))
               ),
               $$5.c($$9)
            ),
            bsv.a($$5.c($$7))
         ),
         $$5x -> {
            vc.d $$6x = $$5x.b($$7, vc.d.a);
            vc.e $$7x = $$5x.b($$6, vc.e.a);
            String $$8x = $$5x.a($$9);
            if ($$8x != null) {
               return new vc.c($$7x, vc.b.b, $$8x, $$6x);
            } else {
               String $$9x = $$5x.a($$10);
               if ($$9x != null) {
                  return new vc.c($$7x, vc.b.c, $$9x, $$6x);
               } else {
                  String $$10x = $$5x.b($$8);
                  return new vc.c($$7x, vc.b.a, $$10x, $$6x);
               }
            }
         }
      );
      bsj<vc.i> $$13 = bsj.a("float_type_suffix");
      $$5.a($$13, bsv.b(bsv.a(btg.a('f', 'F'), bsv.a($$13, vc.i.a)), bsv.a(btg.a('d', 'D'), bsv.a($$13, vc.i.b))), $$1x -> $$1x.b($$13));
      bsj<vc.f<String>> $$14 = bsj.a("float_exponent_part");
      $$5.a($$14, bsv.a(btg.a('e', 'E'), bsv.a($$5.c($$6)), $$5.c($$9)), $$2x -> new vc.f<>($$2x.b($$6, vc.e.a), $$2x.b($$9)));
      bsj<String> $$15 = bsj.a("float_whole_part");
      bsj<String> $$16 = bsj.a("float_fraction_part");
      bsj<T> $$17 = bsj.a("float_literal");
      $$5.a(
         $$17,
         bsv.a(
            bsv.a($$5.c($$6)),
            bsv.b(
               bsv.a($$5.a($$9, $$15), btg.a('.'), bsv.c(), bsv.a($$5.a($$9, $$16)), bsv.a($$5.c($$14)), bsv.a($$5.c($$13))),
               bsv.a(btg.a('.'), bsv.c(), $$5.a($$9, $$16), bsv.a($$5.c($$14)), bsv.a($$5.c($$13))),
               bsv.a($$5.a($$9, $$15), $$5.c($$14), bsv.c(), bsv.a($$5.c($$13))),
               bsv.a($$5.a($$9, $$15), bsv.a($$5.c($$14)), $$5.c($$13))
            )
         ),
         $$6x -> {
            bst $$7x = $$6x.a();
            vc.e $$8x = $$7x.b($$6, vc.e.a);
            String $$9x = $$7x.a($$15);
            String $$10x = $$7x.a($$16);
            vc.f<String> $$11x = $$7x.a($$14);
            vc.i $$12x = $$7x.a($$13);
            return a($$0, $$8x, $$9x, $$10x, $$11x, $$12x, $$6x);
         }
      );
      bsj<String> $$18 = bsj.a("string_hex_2");
      $$5.a($$18, new vc.h(2));
      bsj<String> $$19 = bsj.a("string_hex_4");
      $$5.a($$19, new vc.h(4));
      bsj<String> $$20 = bsj.a("string_hex_8");
      $$5.a($$20, new vc.h(8));
      bsj<String> $$21 = bsj.a("string_unicode_name");
      $$5.a($$21, new bsy(z, h));
      bsj<String> $$22 = bsj.a("string_escape_sequence");
      $$5.a(
         $$22,
         bsv.b(
            bsv.a(btg.a('b'), bsv.a($$22, "\b")),
            bsv.a(btg.a('s'), bsv.a($$22, " ")),
            bsv.a(btg.a('t'), bsv.a($$22, "\t")),
            bsv.a(btg.a('n'), bsv.a($$22, "\n")),
            bsv.a(btg.a('f'), bsv.a($$22, "\f")),
            bsv.a(btg.a('r'), bsv.a($$22, "\r")),
            bsv.a(btg.a('\\'), bsv.a($$22, "\\")),
            bsv.a(btg.a('\''), bsv.a($$22, "'")),
            bsv.a(btg.a('"'), bsv.a($$22, "\"")),
            bsv.a(btg.a('x'), $$5.c($$18)),
            bsv.a(btg.a('u'), $$5.c($$19)),
            bsv.a(btg.a('U'), $$5.c($$20)),
            bsv.a(btg.a('N'), btg.a('{'), $$5.c($$21), btg.a('}'))
         ),
         $$5x -> {
            bst $$6x = $$5x.a();
            String $$7x = $$6x.b($$22);
            if ($$7x != null) {
               return $$7x;
            } else {
               String $$8x = $$6x.b($$18, $$19, $$20);
               if ($$8x != null) {
                  int $$9x = HexFormat.fromHexDigits($$8x);
                  if (!Character.isValidCodePoint($$9x)) {
                     $$5x.b().a($$5x.g(), bsm.a(c, String.format(Locale.ROOT, "U+%08X", $$9x)));
                     return null;
                  } else {
                     return Character.toString($$9x);
                  }
               } else {
                  String $$10x = $$6x.b($$21);

                  int $$11x;
                  try {
                     $$11x = Character.codePointOf($$10x);
                  } catch (IllegalArgumentException var12x) {
                     $$5x.b().a($$5x.g(), h);
                     return null;
                  }

                  return Character.toString($$11x);
               }
            }
         }
      );
      bsj<String> $$23 = bsj.a("string_plain_contents");
      $$5.a($$23, x);
      bsj<List<String>> $$24 = bsj.a("string_chunks");
      bsj<String> $$25 = bsj.a("string_contents");
      bsj<String> $$26 = bsj.a("single_quoted_string_chunk");
      bsq<StringReader, String> $$27 = $$5.a(
         $$26, bsv.b($$5.a($$23, $$25), bsv.a(btg.a('\\'), $$5.a($$22, $$25)), bsv.a(btg.a('"'), bsv.a($$25, "\""))), $$1x -> $$1x.b($$25)
      );
      bsj<String> $$28 = bsj.a("single_quoted_string_contents");
      $$5.a($$28, bsv.a($$27, $$24), $$1x -> a($$1x.b($$24)));
      bsj<String> $$29 = bsj.a("double_quoted_string_chunk");
      bsq<StringReader, String> $$30 = $$5.a(
         $$29, bsv.b($$5.a($$23, $$25), bsv.a(btg.a('\\'), $$5.a($$22, $$25)), bsv.a(btg.a('\''), bsv.a($$25, "'"))), $$1x -> $$1x.b($$25)
      );
      bsj<String> $$31 = bsj.a("double_quoted_string_contents");
      $$5.a($$31, bsv.a($$30, $$24), $$1x -> a($$1x.b($$24)));
      bsj<String> $$32 = bsj.a("quoted_string_literal");
      $$5.a(
         $$32,
         bsv.b(bsv.a(btg.a('"'), bsv.c(), bsv.a($$5.a($$31, $$25)), btg.a('"')), bsv.a(btg.a('\''), bsv.a($$5.a($$28, $$25)), btg.a('\''))),
         $$1x -> $$1x.b($$25)
      );
      bsj<String> $$33 = bsj.a("unquoted_string");
      $$5.a($$33, new bti(1, k));
      bsj<T> $$34 = bsj.a("literal");
      bsj<List<T>> $$35 = bsj.a("arguments");
      $$5.a($$35, bsv.a($$5.b($$34), $$35, btg.a(',')), $$1x -> $$1x.b($$35));
      bsj<T> $$36 = bsj.a("unquoted_string_or_builtin");
      $$5.a($$36, bsv.a($$5.c($$33), bsv.a(bsv.a(btg.a('('), $$5.c($$35), btg.a(')')))), $$5x -> {
         bst $$6x = $$5x.a();
         String $$7x = $$6x.b($$33);
         if (!$$7x.isEmpty() && b($$7x.charAt(0))) {
            List<T> $$8x = $$6x.a($$35);
            if ($$8x != null) {
               vd.a $$9x = new vd.a($$7x, $$8x.size());
               vd.b $$10x = vd.c.get($$9x);
               if ($$10x != null) {
                  return $$10x.a($$0, $$8x, $$5x);
               } else {
                  $$5x.b().a($$5x.g(), bsm.a(d, $$9x.toString()));
                  return null;
               }
            } else if ($$7x.equalsIgnoreCase("true")) {
               return $$1;
            } else {
               return (T)($$7x.equalsIgnoreCase("false") ? $$2 : $$0.createString($$7x));
            }
         } else {
            $$5x.b().a($$5x.g(), vd.d, j);
            return null;
         }
      });
      bsj<String> $$37 = bsj.a("map_key");
      $$5.a($$37, bsv.b($$5.c($$32), $$5.c($$33)), $$2x -> $$2x.c($$32, $$33));
      bsj<Entry<String, T>> $$38 = bsj.a("map_entry");
      bsq<StringReader, Entry<String, T>> $$39 = $$5.a($$38, bsv.a($$5.c($$37), btg.a(':'), $$5.c($$34)), $$2x -> {
         bst $$3x = $$2x.a();
         String $$4x = $$3x.b($$37);
         if ($$4x.isEmpty()) {
            $$2x.b().a($$2x.g(), q);
            return null;
         } else {
            T $$5x = $$3x.b($$34);
            return Map.entry($$4x, $$5x);
         }
      });
      bsj<List<Entry<String, T>>> $$40 = bsj.a("map_entries");
      $$5.a($$40, bsv.a($$39, $$40, btg.a(',')), $$1x -> $$1x.b($$40));
      bsj<T> $$41 = bsj.a("map_literal");
      $$5.a($$41, bsv.a(btg.a('{'), $$5.c($$40), btg.a('}')), $$3x -> {
         List<Entry<String, T>> $$4x = $$3x.b($$40);
         if ($$4x.isEmpty()) {
            return $$3;
         } else {
            Builder<T, T> $$5x = ImmutableMap.builderWithExpectedSize($$4x.size());

            for (Entry<String, T> $$6x : $$4x) {
               $$5x.put($$0.createString($$6x.getKey()), $$6x.getValue());
            }

            return (T)$$0.createMap($$5x.buildKeepingLast());
         }
      });
      bsj<List<T>> $$42 = bsj.a("list_entries");
      $$5.a($$42, bsv.a($$5.b($$34), $$42, btg.a(',')), $$1x -> $$1x.b($$42));
      bsj<vc.a> $$43 = bsj.a("array_prefix");
      $$5.a(
         $$43,
         bsv.b(bsv.a(btg.a('B'), bsv.a($$43, vc.a.a)), bsv.a(btg.a('L'), bsv.a($$43, vc.a.c)), bsv.a(btg.a('I'), bsv.a($$43, vc.a.b))),
         $$1x -> $$1x.b($$43)
      );
      bsj<List<vc.c>> $$44 = bsj.a("int_array_entries");
      $$5.a($$44, bsv.a($$12, $$44, btg.a(',')), $$1x -> $$1x.b($$44));
      bsj<T> $$45 = bsj.a("list_literal");
      $$5.a($$45, bsv.a(btg.a('['), bsv.b(bsv.a($$5.c($$43), btg.a(';'), $$5.c($$44)), $$5.c($$42)), btg.a(']')), $$5x -> {
         bst $$6x = $$5x.a();
         vc.a $$7x = $$6x.a($$43);
         if ($$7x != null) {
            List<vc.c> $$8x = $$6x.b($$44);
            return $$8x.isEmpty() ? $$7x.a($$0) : $$7x.a($$0, $$8x, $$5x);
         } else {
            List<T> $$9x = $$6x.b($$42);
            return (T)($$9x.isEmpty() ? $$4 : $$0.createList($$9x.stream()));
         }
      });
      bsq<StringReader, T> $$46 = $$5.a(
         $$34,
         bsv.b(
            bsv.a(bsv.b(y), bsv.b($$5.a($$17, $$34), $$5.c($$11))),
            bsv.a(bsv.b(btg.a('"', '\'')), bsv.c(), $$5.c($$32)),
            bsv.a(bsv.b(btg.a('{')), bsv.c(), $$5.a($$41, $$34)),
            bsv.a(bsv.b(btg.a('[')), bsv.c(), $$5.a($$45, $$34)),
            $$5.a($$36, $$34)
         ),
         $$4x -> {
            bst $$5x = $$4x.a();
            String $$6x = $$5x.a($$32);
            if ($$6x != null) {
               return (T)$$0.createString($$6x);
            } else {
               vc.c $$7x = $$5x.a($$11);
               return $$7x != null ? $$7x.a($$0, $$4x) : $$5x.b($$34);
            }
         }
      );
      return new bsx<>($$5, $$46);
   }

   static enum a {
      a(vc.i.c) {
         private static final ByteBuffer d = ByteBuffer.wrap(new byte[0]);

         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createByteList(d);
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<vc.c> $$1, bsr<?> $$2) {
            ByteList $$3 = new ByteArrayList();

            for (vc.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.byteValue());
            }

            return (T)$$0.createByteList(ByteBuffer.wrap($$3.toByteArray()));
         }
      },
      b(vc.i.e, vc.i.c, vc.i.d) {
         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createIntList(IntStream.empty());
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<vc.c> $$1, bsr<?> $$2) {
            java.util.stream.IntStream.Builder $$3 = IntStream.builder();

            for (vc.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.intValue());
            }

            return (T)$$0.createIntList($$3.build());
         }
      },
      c(vc.i.f, vc.i.c, vc.i.d, vc.i.e) {
         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createLongList(LongStream.empty());
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<vc.c> $$1, bsr<?> $$2) {
            java.util.stream.LongStream.Builder $$3 = LongStream.builder();

            for (vc.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.longValue());
            }

            return (T)$$0.createLongList($$3.build());
         }
      };

      private final vc.i d;
      private final Set<vc.i> e;

      a(final vc.i $$0, final vc.i... $$1) {
         this.e = Set.of($$1);
         this.d = $$0;
      }

      public boolean a(vc.i $$0) {
         return $$0 == this.d || this.e.contains($$0);
      }

      public abstract <T> T a(DynamicOps<T> var1);

      @Nullable
      public abstract <T> T a(DynamicOps<T> var1, List<vc.c> var2, bsr<?> var3);

      @Nullable
      protected Number a(vc.c $$0, bsr<?> $$1) {
         vc.i $$2 = this.a($$0.d);
         if ($$2 == null) {
            $$1.b().a($$1.g(), vc.i);
            return null;
         } else {
            return $$0.a(JavaOps.INSTANCE, $$2, $$1);
         }
      }

      @Nullable
      private vc.i a(vc.d $$0) {
         vc.i $$1 = $$0.b();
         if ($$1 == null) {
            return this.d;
         } else {
            return !this.a($$1) ? null : $$1;
         }
      }
   }

   static enum b {
      a,
      b,
      c;
   }

   record c(vc.e a, vc.b b, String c, vc.d d) {

      private vc.g e() {
         if (this.d.b != null) {
            return this.d.b;
         } else {
            return switch (this.b) {
               case a, c -> vc.g.b;
               case b -> vc.g.a;
            };
         }
      }

      private String a(vc.e $$0) {
         boolean $$1 = vc.a(this.c);
         if ($$0 != vc.e.b && !$$1) {
            return this.c;
         } else {
            StringBuilder $$2 = new StringBuilder();
            $$0.a($$2);
            vc.a($$2, this.c, $$1);
            return $$2.toString();
         }
      }

      @Nullable
      public <T> T a(DynamicOps<T> $$0, bsr<?> $$1) {
         return this.a($$0, Objects.requireNonNullElse(this.d.c, vc.i.e), $$1);
      }

      @Nullable
      public <T> T a(DynamicOps<T> $$0, vc.i $$1, bsr<?> $$2) {
         boolean $$3 = this.e() == vc.g.a;
         if (!$$3 && this.a == vc.e.b) {
            $$2.b().a($$2.g(), vc.g);
            return null;
         } else {
            String $$4 = this.a(this.a);

            int $$5 = switch (this.b) {
               case a -> 2;
               case b -> 10;
               case c -> 16;
            };

            try {
               if ($$3) {
                  return (T)(switch ($$1) {
                     case c -> (Object)$$0.createByte(Byte.parseByte($$4, $$5));
                     case d -> (Object)$$0.createShort(Short.parseShort($$4, $$5));
                     case e -> (Object)$$0.createInt(Integer.parseInt($$4, $$5));
                     case f -> (Object)$$0.createLong(Long.parseLong($$4, $$5));
                     default -> {
                        $$2.b().a($$2.g(), vc.e);
                        yield null;
                     }
                  });
               } else {
                  return (T)(switch ($$1) {
                     case c -> (Object)$$0.createByte(UnsignedBytes.parseUnsignedByte($$4, $$5));
                     case d -> (Object)$$0.createShort(vc.a($$4, $$5));
                     case e -> (Object)$$0.createInt(Integer.parseUnsignedInt($$4, $$5));
                     case f -> (Object)$$0.createLong(Long.parseUnsignedLong($$4, $$5));
                     default -> {
                        $$2.b().a($$2.g(), vc.e);
                        yield null;
                     }
                  });
               }
            } catch (NumberFormatException var8) {
               $$2.b().a($$2.g(), vc.a(var8));
               return null;
            }
         }
      }
   }

   record d(@Nullable vc.g b, @Nullable vc.i c) {
      public static final vc.d a = new vc.d(null, null);

      @Nullable
      public vc.g a() {
         return this.b;
      }

      @Nullable
      public vc.i b() {
         return this.c;
      }
   }

   static enum e {
      a,
      b;

      public void a(StringBuilder $$0) {
         if (this == b) {
            $$0.append("-");
         }
      }
   }

   record f<T>(vc.e a, T b) {
   }

   static enum g {
      a,
      b;
   }

   static class h extends bsz {
      public h(int $$0) {
         super($$0, $$0, bsm.a(vc.b, String.valueOf($$0)));
      }

      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
         };
      }
   }

   static enum i {
      a,
      b,
      c,
      d,
      e,
      f;
   }
}
