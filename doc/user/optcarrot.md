# Playing Optcarrot

First, clone the optcarrot repository:

    git clone https://github.com/mame/optcarrot.git
    cd optcarrot

You will need `SDL2` to be installed, then you can play Lan Master 
with the following command.

    path/to/graalvm-0.nn/bin/ruby bin/optcarrot --sdl2 --audio=none examples/Lan_Master.nes

If you have a local checkout of TruffleRuby, you can also use the version of OptCarrot
under `bench/optcarrot`. See `bench/optcarrot/README.md` for details.

More information can be found in Benoit's [blog post](https://eregon.me/blog/2016/11/28/optcarrot.html).
