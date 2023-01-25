# 
# Nome: 02_converter.py
# Data: 29/01/2019
# Autore: Boioli Simone
# Scopo:
#

SUFFIXES = {1000: ['KB', 'MB', 'GB', 'TB', 'PB'],
            1024: ['KiB', 'MiB', 'GiB', 'TiB', 'PiB']}


def approximate_size(size, a_kilobyte_is_1024_bytes=True):
    '''
    Converte la dimensione di un file in una forma leggibile
    size -> dimensione file in byte
    a_kilobyte_is_1024_bytes -> True (usa multipli di 1024), False(usa 1000)
    '''
    
    if size < 0:
        raise ValueError('Il numero non deve essere negativo')

    multiple = 1024 if a_kilobyte_is_1024_bytes else 1000
    for suffix in SUFFIXES[multiple]:
        size /= multiple
        if size < multiple:
            return '{0:.1f}{1}'.format(size, suffix)

    raise ValueError('numero troppo grande')


if __name__ == '__main__':
    print(approximate_size(100000000000, False))
    print(approximate_size(100000000000))
