# Installing LLVM

TruffleRuby needs LLVM to run and build C extensions - version 3.8, 3.9 or 4.0.

LLVM 5.0 should also work but is not actively tested.

## Ubuntu

For using C extensions:

```
apt-get install libc++-dev libc++abi1
```

Note that we install `libc++-dev` here, as installing `libc++` seems to
introduce some system conflicts.

Additionally, for building C extensions:

```
apt-get install clang llvm libc++abi-dev
```

## Fedora

For using C extensions:

```
sudo dnf install libcxx libcxxabi
```

Additionally, for building C extensions:

```
sudo dnf install clang llvm libcxx-devel
```

## macOS

We need the `opt` command, so you can't just use what is installed by Xcode if
you are on macOS. We would recommend that you install LLVM 4 via
[Homebrew](https://brew.sh) and then manually set your path.

```bash
brew install llvm@4
export PATH="/usr/local/opt/llvm@4/bin:$PATH"
```
