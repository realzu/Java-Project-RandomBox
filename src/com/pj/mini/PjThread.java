package com.pj.mini;

public class PjThread  {
	//implements Runnable
	String[] boxImages = new String[2];
	
	int cnt = 0;
	
	/*public void movingbox() {
		
		String[] boxImages = new String[1];
		
		boxImages[0] ="\r\n" + 
				"\r\n" + 
				"                                     ,----                            \r\n" + 
				"                            *       =#@;~@                            \r\n" + 
				"                          ;@@@@-. :@@-  -@                            \r\n" + 
				"                          ~@!-;@#*@!-  :@*      !*.                   \r\n" + 
				"                      *-.. #@,  @@=   -@@@@...@@#!                    \r\n" + 
				"                      :#@@!!@@$!:@=:!#@#::@@@@;:                      \r\n" + 
				"                          ;@@@@@@@@@@~                                \r\n" + 
				"                    $@@@@@@@@@@@@@@@@@@@@@@@@@@-                      \r\n" + 
				"                   .##         #= -@$        ~@!                      \r\n" + 
				"                   .$#:::::::::#$:!@#::::::::!@!                      \r\n" + 
				"                    *@@@@@@@@@@@@@@@@@@@@@@@@@@                       \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #= -@$       @!                        \r\n" + 
				"                      -!@@@@@@@@@@@@@@@@@@@@;-                        \r\n" + 
				"                                                                      \r\n" + 
				"";
				
		boxImages[1] ="\r\n" + 
				"\r\n" + 
				"                                                                      \r\n" + 
				"                                  @@                                  \r\n" + 
				"                                  @:                                  \r\n" + 
				"                         -@@,    $@-               @@                 \r\n" + 
				"                        ;@;@#.  ,#$             *==$$==!              \r\n" + 
				"                        #@  @@:@@@;-@#.        -$@@.-@@=.             \r\n" + 
				"                       .@@  $@@;~~=@:$@-         !@..@!               \r\n" + 
				"                       .@!  ;@* ~@@-  @@         *@@@@~               \r\n" + 
				"                       .@@  #@-;@!~  :@*         ::.-:;               \r\n" + 
				"                      ..!@  @@$@*   @@$                               \r\n" + 
				"                  ~@@@!=@@=@@@$;  .##~                                \r\n" + 
				"                  =#,    .@@@@*  =@@   -#                             \r\n" + 
				"                  :*@@@@@@@@* !:!@;. -:=**:                           \r\n" + 
				"                    ..*@@@@@: ~@@-    -$.@.                           \r\n" + 
				"                   ~~@@@@*~ $:@=-     ,$*#       ~@-                  \r\n" + 
				"                 ,$@@-$@!   #@=          .     $$#~@$*                \r\n" + 
				"                 == ,@#*  .@#! ,;@-            -@*,;$                 \r\n" + 
				"                   ,##.  =#@,  !=-$             ##@@:                 \r\n" + 
				"                   @@   *@=     #$=             =~ -:                 \r\n" + 
				"                   ;@!:*@*~~~~~~;~!~~~~~~~~~                          \r\n" + 
				"                    !#@@@#######@@##@#######@!                        \r\n" + 
				"                      :$@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       -@=======@@=$@$======@@                        \r\n" + 
				"                        !$$$$$$$$$$$$$$$$$$$$~                        \r\n" + 
				"                                                                      \r\n" + 
				"";
		
		for(int i=0;i<boxImages.length;i++) {
			
			System.out.println(boxImages[i]);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}			
		}		
	}*/
	
	/*@Override
	public void run() {
		
		while(true) {
			System.out.print(".");
			
			try {
				
				Thread.sleep(500);
				
				if(cnt==10)
					break;
				
				cnt++;				
				
			} catch (Exception ie) {
				System.out.println(ie.toString());
			}			
		}
		
		try {
			
			System.out.println("\r\n" + 
					"\r\n" + 
					"                                                                      \r\n" + 
					"                                  @@                                  \r\n" + 
					"                                  @:                                  \r\n" + 
					"                         -@@,    $@-               @@                 \r\n" + 
					"                        ;@;@#.  ,#$             *==$$==!              \r\n" + 
					"                        #@  @@:@@@;-@#.        -$@@.-@@=.             \r\n" + 
					"                       .@@  $@@;~~=@:$@-         !@..@!               \r\n" + 
					"                       .@!  ;@* ~@@-  @@         *@@@@~               \r\n" + 
					"                       .@@  #@-;@!~  :@*         ::.-:;               \r\n" + 
					"                      ..!@  @@$@*   @@$                               \r\n" + 
					"                  ~@@@!=@@=@@@$;  .##~                                \r\n" + 
					"                  =#,    .@@@@*  =@@   -#                             \r\n" + 
					"                  :*@@@@@@@@* !:!@;. -:=**:                           \r\n" + 
					"                    ..*@@@@@: ~@@-    -$.@.                           \r\n" + 
					"                   ~~@@@@*~ $:@=-     ,$*#       ~@-                  \r\n" + 
					"                 ,$@@-$@!   #@=          .     $$#~@$*                \r\n" + 
					"                 == ,@#*  .@#! ,;@-            -@*,;$                 \r\n" + 
					"                   ,##.  =#@,  !=-$             ##@@:                 \r\n" + 
					"                   @@   *@=     #$=             =~ -:                 \r\n" + 
					"                   ;@!:*@*~~~~~~;~!~~~~~~~~~                          \r\n" + 
					"                    !#@@@#######@@##@#######@!                        \r\n" + 
					"                      :$@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       -@=======@@=$@$======@@                        \r\n" + 
					"                        !$$$$$$$$$$$$$$$$$$$$~                        \r\n" + 
					"                                                                      \r\n" + 
					"");
			
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		boxImages[0] ="\r\n" + 
				"\r\n" + 
				"                                     ,----                            \r\n" + 
				"                            *       =#@;~@                            \r\n" + 
				"                          ;@@@@-. :@@-  -@                            \r\n" + 
				"                          ~@!-;@#*@!-  :@*      !*.                   \r\n" + 
				"                      *-.. #@,  @@=   -@@@@...@@#!                    \r\n" + 
				"                      :#@@!!@@$!:@=:!#@#::@@@@;:                      \r\n" + 
				"                          ;@@@@@@@@@@~                                \r\n" + 
				"                    $@@@@@@@@@@@@@@@@@@@@@@@@@@-                      \r\n" + 
				"                   .##         #= -@$        ~@!                      \r\n" + 
				"                   .$#:::::::::#$:!@#::::::::!@!                      \r\n" + 
				"                    *@@@@@@@@@@@@@@@@@@@@@@@@@@                       \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #= -@$       @!                        \r\n" + 
				"                      -!@@@@@@@@@@@@@@@@@@@@;-                        \r\n" + 
				"                                                                      \r\n" + 
				"";
				
		boxImages[1] ="\r\n" + 
				"\r\n" + 
				"                                                                      \r\n" + 
				"                                  @@                                  \r\n" + 
				"                                  @:                                  \r\n" + 
				"                         -@@,    $@-               @@                 \r\n" + 
				"                        ;@;@#.  ,#$             *==$$==!              \r\n" + 
				"                        #@  @@:@@@;-@#.        -$@@.-@@=.             \r\n" + 
				"                       .@@  $@@;~~=@:$@-         !@..@!               \r\n" + 
				"                       .@!  ;@* ~@@-  @@         *@@@@~               \r\n" + 
				"                       .@@  #@-;@!~  :@*         ::.-:;               \r\n" + 
				"                      ..!@  @@$@*   @@$                               \r\n" + 
				"                  ~@@@!=@@=@@@$;  .##~                                \r\n" + 
				"                  =#,    .@@@@*  =@@   -#                             \r\n" + 
				"                  :*@@@@@@@@* !:!@;. -:=**:                           \r\n" + 
				"                    ..*@@@@@: ~@@-    -$.@.                           \r\n" + 
				"                   ~~@@@@*~ $:@=-     ,$*#       ~@-                  \r\n" + 
				"                 ,$@@-$@!   #@=          .     $$#~@$*                \r\n" + 
				"                 == ,@#*  .@#! ,;@-            -@*,;$                 \r\n" + 
				"                   ,##.  =#@,  !=-$             ##@@:                 \r\n" + 
				"                   @@   *@=     #$=             =~ -:                 \r\n" + 
				"                   ;@!:*@*~~~~~~;~!~~~~~~~~~                          \r\n" + 
				"                    !#@@@#######@@##@#######@!                        \r\n" + 
				"                      :$@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       -@=======@@=$@$======@@                        \r\n" + 
				"                        !$$$$$$$$$$$$$$$$$$$$~                        \r\n" + 
				"                                                                      \r\n" + 
				"";
		
		for(int i=0;i<boxImages.length;i++) {
			
			System.out.println(boxImages[i]);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}			
		}
		
			
	}

	public static void main(String[] args) {
		
		Thread t = new Thread(new PjThread());
		
		System.out.println("\r\n" + 
				"\r\n" + 
				"                                     ,----                            \r\n" + 
				"                            *       =#@;~@                            \r\n" + 
				"                          ;@@@@-. :@@-  -@                            \r\n" + 
				"                          ~@!-;@#*@!-  :@*      !*.                   \r\n" + 
				"                      *-.. #@,  @@=   -@@@@...@@#!                    \r\n" + 
				"                      :#@@!!@@$!:@=:!#@#::@@@@;:                      \r\n" + 
				"                          ;@@@@@@@@@@~                                \r\n" + 
				"                    $@@@@@@@@@@@@@@@@@@@@@@@@@@-                      \r\n" + 
				"                   .##         #= -@$        ~@!                      \r\n" + 
				"                   .$#:::::::::#$:!@#::::::::!@!                      \r\n" + 
				"                    *@@@@@@@@@@@@@@@@@@@@@@@@@@                       \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #= -@$       @!                        \r\n" + 
				"                      -!@@@@@@@@@@@@@@@@@@@@;-                        \r\n" + 
				"                                                                      \r\n" + 
				"");
		
		System.out.print("              두근두근 랜덤박스 고르는 중");
		
		t.start();
		
		try {			
			Thread.sleep(1000);			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		

		System.out.println("\r\n" + 
				"\r\n" + 
				"                                     ,----                            \r\n" + 
				"                            *       =#@;~@                            \r\n" + 
				"                          ;@@@@-. :@@-  -@                            \r\n" + 
				"                          ~@!-;@#*@!-  :@*      !*.                   \r\n" + 
				"                      *-.. #@,  @@=   -@@@@...@@#!                    \r\n" + 
				"                      :#@@!!@@$!:@=:!#@#::@@@@;:                      \r\n" + 
				"                          ;@@@@@@@@@@~                                \r\n" + 
				"                    $@@@@@@@@@@@@@@@@@@@@@@@@@@-                      \r\n" + 
				"                   .##         #= -@$        ~@!                      \r\n" + 
				"                   .$#:::::::::#$:!@#::::::::!@!                      \r\n" + 
				"                    *@@@@@@@@@@@@@@@@@@@@@@@@@@                       \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #* -@$       @!                        \r\n" + 
				"                     .@@       #= -@$       @!                        \r\n" + 
				"                      -!@@@@@@@@@@@@@@@@@@@@;-                        \r\n" + 
				"                                                                      \r\n" + 
				"");
		
			
		System.out.println("\r\n" + 
				"\r\n" + 
				"                                                                      \r\n" + 
				"                                  @@                                  \r\n" + 
				"                                  @:                                  \r\n" + 
				"                         -@@,    $@-               @@                 \r\n" + 
				"                        ;@;@#.  ,#$             *==$$==!              \r\n" + 
				"                        #@  @@:@@@;-@#.        -$@@.-@@=.             \r\n" + 
				"                       .@@  $@@;~~=@:$@-         !@..@!               \r\n" + 
				"                       .@!  ;@* ~@@-  @@         *@@@@~               \r\n" + 
				"                       .@@  #@-;@!~  :@*         ::.-:;               \r\n" + 
				"                      ..!@  @@$@*   @@$                               \r\n" + 
				"                  ~@@@!=@@=@@@$;  .##~                                \r\n" + 
				"                  =#,    .@@@@*  =@@   -#                             \r\n" + 
				"                  :*@@@@@@@@* !:!@;. -:=**:                           \r\n" + 
				"                    ..*@@@@@: ~@@-    -$.@.                           \r\n" + 
				"                   ~~@@@@*~ $:@=-     ,$*#       ~@-                  \r\n" + 
				"                 ,$@@-$@!   #@=          .     $$#~@$*                \r\n" + 
				"                 == ,@#*  .@#! ,;@-            -@*,;$                 \r\n" + 
				"                   ,##.  =#@,  !=-$             ##@@:                 \r\n" + 
				"                   @@   *@=     #$=             =~ -:                 \r\n" + 
				"                   ;@!:*@*~~~~~~;~!~~~~~~~~~                          \r\n" + 
				"                    !#@@@#######@@##@#######@!                        \r\n" + 
				"                      :$@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       $@       @@ -@~      @@.                       \r\n" + 
				"                       -@=======@@=$@$======@@                        \r\n" + 
				"                        !$$$$$$$$$$$$$$$$$$$$~                        \r\n" + 
				"                                                                      \r\n" + 
				"");
		

		
		
	}


*/
}
