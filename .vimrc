"##############################################
"#   The lines below are settings for vim     #
"##############################################
"Turn on line numbers
set nu

"Highlight all its matches.
set hlsearch
set incsearch

" No wrap
set nowrap

" Change TAB to SPACE
set expandtab
set shiftwidth=2
set softtabstop=2
set tabstop=2

filetype on
syn on

"##############################################
"#   The lines below are settings for netrw   #
"##############################################
" To change the way netrw shows the files and directorys
let g:netrw_liststyle=3

" Set the split windows to always be equal and open splits to the right
let g:netrw_winsize=70 
let g:netrw_altv=1
let g:netrw_alto=0
