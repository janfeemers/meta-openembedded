SUMMARY = "A fully featured modbus protocol stack in python"
HOMEPAGE = "https://github.com/riptideio/pymodbus/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c2223d66c7e674b40527b5a4c35bd76"
DEPENDS += "python3-six-native"

SRC_URI[sha256sum] = "5769ac9a00ffc154e1761c69299c1968dcab1c2a61741b1caff89c4aea81dbcf"
S = "${WORKDIR}/pymodbus-${PV}"

inherit pypi setuptools3

PACKAGECONFIG ??= ""
PACKAGECONFIG[repl] = ",,,python3-aiohttp python3-click python3-prompt-toolkit python3-pygments python3-pyserial-asyncio"
PACKAGECONFIG[asyncio] = ",,,python3-pyserial-asyncio"
PACKAGECONFIG[tornado] = ",,,python3-tornado"
PACKAGECONFIG[twisted] = ",,,python3-twisted-conch"
PACKAGECONFIG[redis] = ",,,python3-redis"
PACKAGECONFIG[sql] = ",,,python3-sqlalchemy"

RDEPENDS:${PN} += " \
    python3-asyncio \
    python3-core \
    python3-io \
    python3-json \
    python3-logging \
    python3-math \
    python3-netserver \
"

RDEPENDS:${PN} += " \
    python3-pyserial \
    python3-six \
"


